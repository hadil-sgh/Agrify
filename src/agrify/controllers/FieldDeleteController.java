package agrify.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FieldDeleteController {

    @FXML
    private Button DeleteBackFieldBtn1;

    @FXML
    private Button DeleteDeleteFieldBtn;

    @FXML
    private TextField DeleteFieldSearchFieldTextfile;

    @FXML
    private Button DeleteSearchFieldBtn;

    @FXML
    private Label EditUserMessage11;

    @FXML
    private TableView<?> FieldHome;

    @FXML
    private TableColumn<?, ?> FieldHome_id;

    @FXML
    private TableColumn<?, ?> FieldHome_nom;

    @FXML
    private TableColumn<?, ?> FieldHome_quantité;

    @FXML
    private TableColumn<?, ?> FieldHome_superficie;

    @FXML
    private TableColumn<?, ?> FieldHome_type;

    @FXML
    void DeleteBackField(ActionEvent event) throws IOException{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) DeleteBackFieldBtn1.getScene().getWindow();
   splashSignInStage.close();
    }

    @FXML
    void DeleteDeleteField(ActionEvent event) {

    }

    @FXML
    void DeleteSearchField(ActionEvent event) {

    }

}
