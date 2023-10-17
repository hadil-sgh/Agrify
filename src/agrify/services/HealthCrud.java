/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrify.services;

import agrify.utils.MyConnection;
import agrify.entities.Healh;
import agrify.services.HealthInterfaces; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hadil sghair
 */
public class HealthCrud implements HealthInterfaces {
Connection cnx=MyConnection.getInstance().getCon();
    @Override
    public void ajoutermaladie(Healh h) {
         try {
            String req ="INSERT INTO `health`(`animalId`, `typeDeMaladie`, `medicament`, `typeDeTraitement`, `dosage`) VALUES ('"+h.getAnimalId()+"','"+h.getTypeDeMaladie()+"','"+h.getMedicament()+"','"+h.getTypeDeTraitement()+"','"+h.getDosage()+"')";
            Statement stm = cnx.createStatement();
            stm.executeUpdate(req);
            System.out.println("animal malade ajouté");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifiermaladie(int id, Healh h) {
       String sql = "UPDATE `health` SET `animalId`=?,`typeDeMaladie`=?,`medicament`=?,`typeDeTraitement`=?,`dosage`=? WHERE `healthid`=?";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setString(1, h.getAnimalId());
            ps.setString(2, h.getTypeDeMaladie());
            ps.setString(3, h.getMedicament());
            ps.setString(4, h.getTypeDeTraitement());
            ps.setString(5, h.getDosage());
            
            ps.setInt(6, id);

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
    public void supprimermaladie(int id) {
       String requet = "DELETE FROM `health` WHERE `healthid`=?";

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
    public List<Healh> affichermaladie() {
       List <Healh> recs =new ArrayList<>();
        String requet="SELECT `healthid`, `animalId`, `typeDeMaladie`, `medicament`, `typeDeTraitement`, `dosage` FROM `health` WHERE 1";
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            ResultSet res =stm.executeQuery(requet);
            while (res.next()){
               Healh rp=new Healh();
               rp.setHealthid(res.getInt(1));
               rp.setAnimalId(res.getString(2));
               rp.setTypeDeMaladie(res.getString(3));
               rp.setMedicament(res.getString(4));
               rp.setTypeDeTraitement(res.getString(5));
               rp.setDosage(res.getString(6));
              
                recs.add(rp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return recs;
    }
    
      public Healh rechercheMaladieParId(int id) {
    try {
        String req = "SELECT * FROM `health` WHERE healthid = " + id;
        Statement stm = cnx.createStatement();
        ResultSet res = stm.executeQuery(req);

        if (res.next()) {
             Healh rp=new Healh();
               rp.setHealthid(res.getInt("healthid"));
               rp.setAnimalId(res.getString("animalId"));
               rp.setTypeDeMaladie(res.getString("typeDeMaladie"));
               rp.setMedicament(res.getString("medicament"));
               rp.setTypeDeTraitement(res.getString("typeDeTraitement"));
               rp.setDosage(res.getString("dosage"));
            
            return rp;
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    
    return null; // Renvoie null si la réclamation n'est pas trouvée.
}
   
}
