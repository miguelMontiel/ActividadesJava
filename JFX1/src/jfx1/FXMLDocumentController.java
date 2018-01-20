package jfx1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable 
{
    @FXML
    private Label label;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private CheckBox chk1;
    @FXML
    private RadioButton radiobutton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event) 
    {
        JOptionPane.showMessageDialog(null, "Netbeans con Scene Builder", "ORACLE JAVA FX", JOptionPane.OK_OPTION);
        chk1.setSelected(true);
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) 
    {
        if(radiobutton.isSelected())
        {
            label.setText("JAVA FX!");
        }
        else
        {
            label.setText(" ");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {

    }        
}
