package agrify.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FieldAjoutController {

    @FXML
    private Button AddFieldBackBtn1;

    @FXML
    private Button AddFieldBtn;

    @FXML
    private Label AddUserMessage;

    @FXML
    private TextField FieldNomTextFill;

    @FXML
    private TextField FieldQuantitéTextFill;

    @FXML
    private TextField FieldSuperficieTextFill;

    @FXML
    private TextField FieldTypeTextFill;

    @FXML
    void AddField(ActionEvent event) {

    }

    @FXML
    void AddFieldBack(ActionEvent event) throws IOException{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) AddFieldBackBtn1.getScene().getWindow();
   splashSignInStage.close();
    }

}
