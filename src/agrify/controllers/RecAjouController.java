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
import javafx.scene.control.ToggleGroup;
import agrify.services.RecCrud;
import agrify.entities.Reclamation;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Hadil sghair
 */
public class RecAjouController implements Initializable {

    @FXML
    private Button recajreturn;
    @FXML
    private TextField recaj1;
    @FXML
    private TextField recaj2;
    @FXML
    private ComboBox recaj3;
    @FXML
    private TextField recaj4;
    @FXML
    private TextField recaj5;
    @FXML
    private ComboBox recaj6;
    @FXML
    private RadioButton recaj1radio1;
    @FXML
    private RadioButton recaj1radio2;
    @FXML
    private Button recaj;
    @FXML
    private Button recclearaj;
    @FXML
    private Label labmsg;
    @FXML
    private ToggleGroup urgence;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ObservableList<String> list1 = FXCollections.observableArrayList( "production agricole","Gestion des ressources","Santéanimale", "climatiques et météorologiques","sécurité");
         recaj3.setItems(list1);
         ObservableList<String> list2 = FXCollections.observableArrayList("Chef d exécution d éleveurs","Chef d exécution des agricoles","manageur de Stock");
         recaj6.setItems(list2);
    }    

    @FXML
    private void returnajo(ActionEvent event) {
        try {
        Parent aff1Root = FXMLLoader.load(getClass().getResource("RecAffichage.fxml"));
        Scene Scene1 = new Scene(aff1Root);
        
        
        // Create a new stage  interface
        Stage ret1Stage = new Stage();
        ret1Stage.initStyle(StageStyle.TRANSPARENT);
        ret1Stage.setScene(Scene1);
        ret1Stage.show();
        
        // Close the splash screen stage
        Stage splash2 = (Stage) recajreturn.getScene().getWindow();
        splash2.close();
    } catch (IOException ex) {
        Logger.getLogger(RecAffichageController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void saverec(ActionEvent event) {
      //////////////////
        String a1= recaj1.getText();
        String a2= recaj2.getText();
        String s = recaj3.getSelectionModel().getSelectedItem().toString();
         String a4= recaj4.getText();
        String a5= recaj5.getText();
        String s6 = recaj6.getSelectionModel().getSelectedItem().toString();
          String b = "" ;
         if(recaj1radio1.isSelected()) {
               b="urgent";
              System.out.println("Radio 1 Selected: ");
  }
          else if(recaj1radio1.isSelected()) {
                b="Not urgent";
          
         } else {
                    b = "Not urgent"; 
}

      if (a1.isEmpty()) {
        showAlert("Le champ emp est requis.");
        return;
    } 
        if (a2.isEmpty()) {
        showAlert("Le champ date est requis.");
        return;
    }
          
        if (a4.isEmpty()) {
        showAlert("Le champ description est requis.");
        return;
    }
        if (a5.isEmpty()) {
        showAlert("Le champ id A/P est requis.");
        return;
    }

         showAlertIfValueIsNull(recaj3);
         showAlertIfValueIsNull(recaj6);

if (b.isEmpty()) {
        showAlert("Le champ id A/P est requis.");
        return;
    }
                                         
   
                        
       Reclamation r1 =new Reclamation(a1,a2,s,a4,a5,s6,b);
       RecCrud lp=new RecCrud();
      lp.ajouterreclamation(r1);
        labmsg.setText("Reclamation Ajouté"); 
        
       
     

    }

    @FXML
    private void clearval(ActionEvent event) {
            recaj1.clear();
            recaj2.clear();
            recaj4.clear();
            recaj5.clear();
            recaj3.getSelectionModel().clearSelection();
            recaj6.getSelectionModel().clearSelection();
            recaj1radio1.setSelected(false);
            recaj1radio2.setSelected(false);
    }

    @FXML
    private void geturgence(ActionEvent event) {
    }
  
            
      
         
     private void showAlert(String message) {
          Alert alert = new Alert(Alert.AlertType.ERROR);
          alert.setTitle("Erreur de saisie");
          alert.setHeaderText(null);
          alert.setContentText(message);
          alert.showAndWait();
}    
      public static void showAlertIfValueIsNull(ComboBox<String> comboBox) {
        if (comboBox.getValue() == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a valid option from the ComboBox.");
            alert.showAndWait();
        }
    }
        
    }

    

  
    

