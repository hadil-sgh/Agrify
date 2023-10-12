package agrify.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BestUserController {

    @FXML
    private Button BestUserSearchBtn;

    @FXML
    private TableColumn<?, ?> BestUserUser_Nom;

    @FXML
    private TableColumn<?, ?> BestUserUser_id;

    @FXML
    private TableColumn<?, ?> BestUserUser_nbrabscence;

    @FXML
    private TableColumn<?, ?> BestUserUser_prenom;

    @FXML
    private TableView<?> BestUserView;

    @FXML
    private Label EditUserMessage11;

    @FXML
    private Label EditUserMessage111;

    @FXML
    private Button UserBestBackBtn;

    @FXML
    void BestUserSearch(ActionEvent event) {

    }

    @FXML
    void UserBestBack(ActionEvent event)throws Exception{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/UserHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) UserBestBackBtn.getScene().getWindow();
   splashSignInStage.close();

}
}