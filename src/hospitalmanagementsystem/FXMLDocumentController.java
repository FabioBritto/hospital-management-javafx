/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package hospitalmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Samsung
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private CheckBox loginCheckbox;

    @FXML
    private Hyperlink loginCreateAccount;

    @FXML
    private AnchorPane loginForm;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private ComboBox<?> loginSelectUserCmb;

    @FXML
    private TextField loginShowPassword;

    @FXML
    private Button loginSignInBtn;

    @FXML
    private TextField loginUsername;

    @FXML
    private AnchorPane mainForm;

    @FXML
    private CheckBox registerCheckbox;

    @FXML
    private TextField registerEmail;

    @FXML
    private AnchorPane registerForm;

    @FXML
    private Hyperlink registerLoginHere;

    @FXML
    private PasswordField registerPassword;

    @FXML
    private TextField registerShowPassword;

    @FXML
    private Button registerSignUpBtn;

    @FXML
    private TextField registerUsername;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    public void switchForm(ActionEvent event){
        if(event.getSource() == loginCreateAccount){
            loginForm.setVisible(false);
            registerForm.setVisible(true);
        }
        else if(event.getSource() == registerLoginHere){
            registerForm.setVisible(false);
            loginForm.setVisible(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
