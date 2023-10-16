package  agrify.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminDashboardController {

    @FXML
    private Button AdminDashboardAccountSettingsBtn;

    @FXML
    private Button AdminDashboardDeconnexionBtn;

    @FXML
    private Button AdminDashboardGestionAchatBtn;

    @FXML
    private Button AdminDashboardGestionAnimalBtn;

    @FXML
    private Button AdminDashboardGestionFieldBtn;

    @FXML
    private Button AdminDashboardGestionMaterialBtn;

    @FXML
    private Button AdminDashboardGestionReclamationBtn;

    @FXML
    private Button AdminDashboardGestionTachesBtn;

    @FXML
    private Button AdminDashboardGestionUserBtn;

    @FXML
    private Button AdminDashboardGestionVenteBtn;

    @FXML
    void AdminDashboardAccountSettings(ActionEvent event) {

    }

    @FXML
    void AdminDashboardDeconnexion(ActionEvent event)throws Exception{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/Home.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) AdminDashboardDeconnexionBtn.getScene().getWindow();
   splashSignInStage.close();
    }

    @FXML
    void AdminDashboardGestionAchat(ActionEvent event) {

    }

    @FXML
    void AdminDashboardGestionAnimal(ActionEvent event) {

    }

    @FXML
    void AdminDashboardGestionField(ActionEvent event) throws Exception{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) AdminDashboardGestionFieldBtn.getScene().getWindow();
   splashSignInStage.close();
    }

    @FXML
    void AdminDashboardGestionMaterial(ActionEvent event) {

    }

    @FXML
    void AdminDashboardGestionReclamation(ActionEvent event) {

    }

    @FXML
    void AdminDashboardGestionTaches(ActionEvent event) {

    }
    
     @FXML
    void AdminDashboardGestionVente(ActionEvent event) {

    }

    @FXML
    void AdminDashboardGestionUser(ActionEvent event) throws Exception{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/UserHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) AdminDashboardGestionUserBtn.getScene().getWindow();
   splashSignInStage.close();
    
    }
    

   

}
