/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrify.controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author alien kami sama
 */



public class AnimalManagementController implements Initializable {
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
       @FXML
    private AnchorPane anchor_ajouter_ingrediant;

    @FXML
    private AnchorPane anchor_ajouter_ingrediant1;

    @FXML
    private AnchorPane anchor_modifier_ingrediant;

    @FXML
    private BarChart<?, ?> bar_chart_produit;

    @FXML
    private Button btn_ajouter_ingrediant;

    @FXML
    private Button btn_besoin_nutritionnel;

    @FXML
    private Button btn_elevage;

    @FXML
    private Button btn_enregistrer;

    @FXML
    private Button btn_exit;

    @FXML
    private Button btn_exit1;

    @FXML
    private Button btn_ingredient;

    @FXML
    private Button btn_ingredient_indiv;

    @FXML
    private Button btn_nourriture_animale;

    @FXML
    private Button btn_produit;

    @FXML
    private Button btn_reclamation;

    @FXML
    private Button btn_reinitialisation_filtre;

    @FXML
    private Button btn_tableau_bord;

    @FXML
    private Button btn_tableau_bord11;

    @FXML
    private Button btn_tache;

    @FXML
    private Button btn_tous_ingredient;

    @FXML
    private ComboBox<String> cree_ingredient_combobox;

    @FXML
    private Label label_betails_en_gestation;

    @FXML
    private Label label_ovins_en_gestation;

    @FXML
    private Label label_rendement_mensuel_de_laine;

    @FXML
    private Label label_rendement_quotidien_en_miel;

    @FXML
    private Label label_rendement_quotidien_en_œufs;

    @FXML
    private LineChart<?, ?> line_chart_nouveau_nes;
    
    @FXML
    private AnchorPane anchor_valeur_nutritionnelles1;
    
    @FXML
    private AnchorPane anchor_valeur_nutritionnelles2;

    @FXML
    private ComboBox<String> nutriment_principal_combobox;

    @FXML
    private AnchorPane page_ingredient_main;

    @FXML
    private AnchorPane page_ingredient_managment;

    @FXML
    private AnchorPane page_tableau_bord;

    @FXML
    private TextField rechercher_input;
    
    public void changeWithCombobox(){
        cree_ingredient_combobox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
    if ("ingredient individual".equals(newValue)) {
       page_ingredient_managment.setVisible(true);
       anchor_ajouter_ingrediant.setVisible(true);
       anchor_modifier_ingrediant.setVisible(false);
       anchor_valeur_nutritionnelles1.setVisible(true);
       anchor_valeur_nutritionnelles2.setVisible(false);
      
    } else {
      
        page_ingredient_managment.setVisible(false);
    }
});
    }
    
    public void exit(ActionEvent event){
        if (event.getSource()==btn_exit){
            page_ingredient_managment.setVisible(false);
        }else if (event.getSource()==btn_exit1){
             page_ingredient_managment.setVisible(false);
        }
    }
    
    public void changerContinu(ActionEvent event){
        
        if (event.getSource()== btn_ingredient){
            page_tableau_bord.setVisible(false);
            page_ingredient_main.setVisible(true);
            page_ingredient_managment.setVisible(false);
      
        }else if (event.getSource() == btn_tableau_bord){
            page_tableau_bord.setVisible(true);
            page_ingredient_main.setVisible(false);
            page_ingredient_managment.setVisible(false);
            anchor_valeur_nutritionnelles1.setVisible(true);
        }else if (event.getSource()== btn_enregistrer){
            anchor_valeur_nutritionnelles1.setVisible(false);
            anchor_valeur_nutritionnelles2.setVisible(true);
            page_ingredient_managment.setVisible(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       cree_ingredient_combobox.setItems(FXCollections.observableArrayList("Créer un nouvel ingrédient","ingredient individual","nuriture animal"));
       nutriment_principal_combobox.setItems(FXCollections.observableArrayList("Nutriment  Principal ","Fibre","Énergie","Protéine","Minéral"));

    }    
    
}
