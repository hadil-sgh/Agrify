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

public class FieldModifierController {

    @FXML
    private TextField EditFieldNomTextField;

    @FXML
    private TextField EditFieldQuantitéTextField;

    @FXML
    private TextField EditFieldSuperficieTextField;

    @FXML
    private TextField EditFieldTypeTextField;

    @FXML
    private Label EditUserMessage1;

    @FXML
    private Label EditUserMessage11;

    @FXML
    private Label EditUserMessage111;

    @FXML
    private Button ModifyFieldBackBtn;

    @FXML
    private Button ModifyFieldBtn;

    @FXML
    private Button ModifySearchFieldBtn;

    @FXML
    private TextField SearchModifyFieldTextFieldBtn;

    @FXML
    void ModifyField(ActionEvent event) {

    }

    @FXML
    void ModifyFieldBack(ActionEvent event) throws IOException{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) ModifyFieldBackBtn.getScene().getWindow();
   splashSignInStage.close();
    }

    @FXML
    void ModifySearchField(ActionEvent event) {

    }

}
