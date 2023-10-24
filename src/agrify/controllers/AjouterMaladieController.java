/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Healh;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import services.HealthCrud;

/**
 * FXML Controller class
 *
 * @author Hadil sghair
 */
public class AjouterMaladieController implements Initializable {

  @FXML
    private Button vetreturn;

    @FXML
    private TextField vetaj11;

    @FXML
    private TextField vetaj2;

    @FXML
    private TextField vetaj3;

    @FXML
    private TextField vetaj4;

    @FXML
    private RadioButton radiovet1aj;

    @FXML
    private RadioButton radioaj2;

    @FXML
    private Button ajoutermaladie;

    @FXML
    private Button clear;
     @FXML
    private Label vetmsaj;

    @FXML
    void onajoutermaladie(ActionEvent event) {
String a1= vetaj11.getText();
        String a2= vetaj2.getText();
       
         String a4= vetaj3.getText();
        String a5= vetaj4.getText();
        
          String b = "" ;
         if(radiovet1aj.isSelected()) {
               b="vaccination";
              
  }
          else if(radioaj2.isSelected()) {
                b="medicament a avaler";
          
         } else {
                    b = "pas spécifier "; 
}

      if (a1.isEmpty()) {
        showAlert("Le champ id animal est requis.");
        return;
    } 
        if (a2.isEmpty()) {
        showAlert("Le champ Type de médicamaent est requis.");
        return;
    }
          
        if (a4.isEmpty()) {
        showAlert("Le champ medicament est requis.");
        return;
    }
        if (a5.isEmpty()) {
        showAlert("Le champ dosage est requis.");
        return;
    }
if (b.isEmpty()) {
        showAlert("Le champ type de traitement est requis.");
        return;
    }
                                         
   
                        
       Healh h=new Healh (a1,a2,a4,a5,b);
        HealthCrud hp=new HealthCrud();
        
      hp.ajoutermaladie(h);
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Animal malade par l'id "+a1 + "ajouté");
        alert.setHeaderText("Animal malade par l'id "+a1 + "ajouté");
        
        alert.showAndWait();
        vetmsaj.setText("Maladie Ajouté"); 
        
    }

    @FXML
    void onclear(ActionEvent event) {
            vetaj11.clear();
            vetaj2.clear();
            vetaj3.clear();
            vetaj4.clear();
            radiovet1aj.setSelected(false);
           radioaj2.setSelected(false);
    }

    @FXML
    void onvetreturn(ActionEvent event) {
        try {
        Parent aff12Root = FXMLLoader.load(getClass().getResource("AffichageMaladie.fxml"));
        Scene Scene1 = new Scene(aff12Root);
        
        
        // Create a new stage  interface
        Stage ret12Stage = new Stage();
        ret12Stage.initStyle(StageStyle.TRANSPARENT);
        ret12Stage.setScene(Scene1);
        ret12Stage.show();
        
        // Close the splash screen stage
        Stage splash2 = (Stage) vetreturn.getScene().getWindow();
        splash2.close();
    } catch (IOException ex) {
            System.out.println("1");
    }

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private void showAlert(String message) {
          Alert alert = new Alert(Alert.AlertType.ERROR);
          alert.setTitle("Erreur de saisie");
          alert.setHeaderText(null);
          alert.setContentText(message);
          alert.showAndWait();
}     
}
