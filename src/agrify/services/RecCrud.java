/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrify.services;


import agrify.utils.MyConnection;
import agrify.entities.Reclamation;
import agrify.services.Recinterfaces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecCrud  implements Recinterfaces{
  Connection cnx=MyConnection.getInstance().getCon();
    @Override
    public void ajouterreclamation(Reclamation rec) {
        try {
            String req =" INSERT INTO `reclamation`(`rec_emp`, `rec_date`, `typeReclamation`, `rec_description`, `rec_id_anim_plante`, `rec_target`, `urgency`) VALUES" +
                    " ('"+rec.getRec_emp()+"','"+rec.getRec_date()+"','"+rec.getTypeReclamation()+"','"+rec.getRec_description()+"','"+rec.getRec_id_anim_plante()+"','"+rec.getRec_target()+"','"+rec.getUrgency()+"')";
            Statement stm = cnx.createStatement();
            stm.executeUpdate(req);
            System.out.println("reclamtion ajouté");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    @Override
    public void supprimerreclamation(int id) {
        String requet = "DELETE FROM `reclamation` WHERE `rec_id`=?";

        try {
            PreparedStatement preparedStatement = cnx.prepareStatement(requet);
            preparedStatement.setInt(1, id); // Set the value for the parameter
            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Row with id " + id + " deleted successfully.");
            } else {
                System.out.println("No row with id " + id + " found in the database.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public List<Reclamation> afficherreclamation() {
       
        List <Reclamation> recs =new ArrayList<>();
        String requet="SELECT `rec_id`, `rec_emp`, `rec_date`, `typeReclamation`, `rec_description`, `rec_id_anim_plante`, `rec_target`, `urgency` FROM `reclamation` WHERE 1";
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            ResultSet res =stm.executeQuery(requet);
            while (res.next()){
               Reclamation rp=new Reclamation();
               rp.setRec_id(res.getInt(1));
               rp.setRec_emp(res.getString(2));
               rp.setRec_date(res.getString(3));
               rp.setTypeReclamation(res.getString(4));
               rp.setRec_description(res.getString(5));
               rp.setRec_id_anim_plante(res.getString(6));
               rp.setRec_target(res.getString(7));
                rp.setUrgency(res.getString(8));
                recs.add(rp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return recs;
    }
    
    @Override
    public void modifierreclamation(int id,Reclamation rec) {
        String sql = "UPDATE `reclamation` SET rec_emp=?, rec_date=?, typeReclamation=?, rec_description=? ,rec_id_anim_plante=?, rec_target=?, urgency=? WHERE rec_id=?";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setString(1, rec.getRec_emp());
            ps.setString(2, rec.getRec_date());
            ps.setString(3, rec.getTypeReclamation().toString());
            ps.setString(4, rec.getRec_description());
            ps.setString(5, rec.getRec_id_anim_plante());
            ps.setString(6, rec.getRec_target().toString());
            ps.setString(7, rec.getUrgency());
            ps.setInt(8, id);

            int rowsUpdated = ps.executeUpdate();
    
          //  if (rowsUpdated > 0) {
                System.out.println("Rec updated successfully");
           // } else {
           //   }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    
    }
  @Override
    public Reclamation rechercheReclamationParId(int id) {
    try {
        String req = "SELECT * FROM reclamation WHERE rec_id = " + id;
        Statement stm = cnx.createStatement();
        ResultSet rs = stm.executeQuery(req);

        if (rs.next()) {
            Reclamation rec = new Reclamation();
            rec.setRec_id(rs.getInt("rec_id"));
            rec.setRec_emp(rs.getString("rec_emp"));
            rec.setRec_date(rs.getString("rec_date"));
            rec.setTypeReclamation(rs.getString("typeReclamation"));
            rec.setRec_description(rs.getString("rec_description"));
            rec.setRec_id_anim_plante(rs.getString("rec_id_anim_plante"));
            rec.setRec_target(rs.getString("rec_target"));
            rec.setUrgency(rs.getString("urgency"));
            
            return rec;
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    
    return null; // Renvoie null si la réclamation n'est pas trouvée.
}
    public void viderunetable() {
        String req="TRUNCATE TABLE `rec1`.`reclamation`";
         try {
            PreparedStatement preparedStatement = cnx.prepareStatement(req);
             preparedStatement.executeUpdate();

            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
   

}
