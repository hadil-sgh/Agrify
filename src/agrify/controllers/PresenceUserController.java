package agrify.controllers;

import agrify.entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PresenceUserController {

    @FXML
    private Button ActualiserPresenceUserBtn;

    @FXML
    private TableView<User> EmployeeHome;

    @FXML
    private TableColumn<User, Integer> EmployeeHome_abscence;

    @FXML
    private TableColumn<User, String> EmployeeHome_email;

    @FXML
    private TableColumn<User, Integer> EmployeeHome_id;

    @FXML
    private TableColumn<User, String> EmployeeHome_nom;

    @FXML
    private TableColumn<User, String> EmployeeHome_phone;

    @FXML
    private TableColumn<User, String> EmployeeHome_prenom;

    @FXML
    private TableColumn<User, String> EmployeeHome_role;

    @FXML
    private Button PresenceBackUserBtn1;

    @FXML
    private Button PresencePresenceBtn;
    
      @FXML
    private CheckBox PresenceUserAbscentBtn;

    @FXML
    private CheckBox PresenceUserPrésentBtn;

    @FXML
    void ActualiserPresenceUser(ActionEvent event) {

    }

    @FXML
    void PresenceBackUser(ActionEvent event) throws Exception{
      // Load the sign-Up interface
   Parent signUpRoot = FXMLLoader.load(getClass().getResource("/agrify/views/UserHome.fxml"));
   Scene signUpScene = new Scene(signUpRoot);
   

   // Create a new stage for the sign-in interface
   Stage signUpStage = new Stage();
   signUpStage.initStyle(StageStyle.TRANSPARENT);
   signUpStage.setScene(signUpScene);
   signUpStage.show();

   // Close the splash screen stage
   Stage splashSignInStage = (Stage) PresenceBackUserBtn1.getScene().getWindow();
   splashSignInStage.close();
    }

    @FXML
    void PresencePresence(ActionEvent event) {

    }

    
    
    
    
 
    
       @FXML
    void PresenceUserAbscent(ActionEvent event) {

    }

    @FXML
    void PresenceUserPrésent(ActionEvent event) {

    }
}
