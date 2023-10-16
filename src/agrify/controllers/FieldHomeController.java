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

public class FieldHomeController {

    @FXML
    private Button AddFieldBtn;

    @FXML
    private Button DeleteFieldBtn;

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
    private Button ModifyFieldBtn;

    @FXML
    private Button SearchFieldBtn;

    @FXML
    private TextField SearchFieldTextFieldBtn;

    @FXML
    private Button userFieldBackBtn;

    @FXML
    void AddField(ActionEvent event) throws IOException {
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledAdd.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) AddFieldBtn.getScene().getWindow();
   splashSignInStage.close();
    }
    
    
    
    
    @FXML
    void DeleteField(ActionEvent event)  throws IOException {
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledDelete.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) DeleteFieldBtn.getScene().getWindow();
   splashSignInStage.close();
   
   
    }

    @FXML
    void ModifyField(ActionEvent event)throws IOException {
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/FiledModifier.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) ModifyFieldBtn.getScene().getWindow();
   splashSignInStage.close();
    }
   



    @FXML
    void userFieldBack(ActionEvent event) throws IOException {
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/AdminDashboard.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) userFieldBackBtn.getScene().getWindow();
   splashSignInStage.close();
   
   
    }
    
    
    
  
    @FXML
    void SearchField(ActionEvent event) {

    }

}
