/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrify.controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import agrify.services.RecCrud;
import agrify.entities.Reclamation;

/**
 * FXML Controller class
 *
 * @author Hadil sghair
 */
public class RecModifController implements Initializable {

    @FXML
    private TextField rm2;
    @FXML
    private TextField rm3;
    @FXML
    private ComboBox rm4;
    @FXML
    private TextField rm6;
    @FXML
    private ComboBox rm7;
    @FXML
    private TextField rm1;
    @FXML
    private RadioButton mrb1;
    @FXML
    private RadioButton mrb2;
    @FXML
    private Button recmod;
    @FXML
    private Label labelmodif;
    @FXML
    private TextField rm5;
    @FXML
    private Button butndatarec;
    @FXML
    private Label lmr1;
    @FXML
    private Label lrm2;
    @FXML
    private Label lrmc3;
    @FXML
    private Label lrm4;
    @FXML
    private Label lrm5;
    @FXML
    private Label lrm6;
    @FXML
    private Label lrm7;
    @FXML
    private Label lrm8;
    @FXML
    private Button recmodifreturn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list1 = FXCollections.observableArrayList( "production agricole","Gestion des ressources","Santéanimale", "climatiques et météorologiques","sécurité");
         rm4.setItems(list1);
         ObservableList<String> list2 = FXCollections.observableArrayList("Chef d exécution d éleveurs","Chef d exécution des agricoles","manageur de Stock");
         rm7.setItems(list2);
         
         
       
    }    

    @FXML
    private void onactionrecmod(ActionEvent event) {
         int id= Integer.parseInt(rm1.getText()) ;
        String a1= rm2.getText();
        String a2= rm3.getText();
        String s = rm4.getSelectionModel().getSelectedItem().toString();
         String a4= rm5.getText();
        String a5= rm6.getText();
        String s6 = rm7.getSelectionModel().getSelectedItem().toString();
          String b = "" ;
         if(mrb1.isSelected()) {
               b="urgent";
              System.out.println("Radio 1 Selected: ");
  }
          else if(mrb2.isSelected()) {
                b="Not urgent";
          
         } else {
                    b = "Not urgent"; 
}

       
       Reclamation r1 =new Reclamation(a1,a2,s,a4,a5,s6,b);
       RecCrud lp=new RecCrud();
      lp.modifierreclamation(id, r1);
        labelmodif.setText("Reclamation Modifié"); 
        
    }

    @FXML
    private void onbutndatarec(ActionEvent event) {
        int id= Integer.parseInt(rm1.getText()) ;
        RecCrud rp=new RecCrud();
        Reclamation currentReclamation= rp.rechercheReclamationParId(id);
         if (currentReclamation != null) {
          lrm2.setText(currentReclamation.getRec_emp());
          lrmc3.setText(currentReclamation.getRec_date());
          lrm4.setText(currentReclamation.getTypeReclamation());
          lrm5.setText(currentReclamation.getRec_description());
          lrm6.setText(currentReclamation.getRec_id_anim_plante());
          lrm7.setText(currentReclamation.getRec_target());
          lrm8.setText(currentReclamation.getUrgency());
                     
    } else {
        labelmodif.setText("Réclamation non trouvée");
         }
    
}

    @FXML
    private void onrecmodifreturn(ActionEvent event) {
        try {
        Parent rr2Root = FXMLLoader.load(getClass().getResource("RecAffichage.fxml"));
        Scene Scene1 = new Scene(rr2Root);
        
        
        // Create a new stage  interface
        Stage er1Stage = new Stage();
        er1Stage.initStyle(StageStyle.TRANSPARENT);
        er1Stage.setScene(Scene1);
        er1Stage.show();
        
        // Close the splash screen stage
        Stage splash3 = (Stage) recmodifreturn.getScene().getWindow();
        splash3.close();
    } catch (IOException ex) {
        Logger.getLogger(RecAffichageController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}