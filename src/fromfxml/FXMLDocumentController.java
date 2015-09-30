/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

/**
 *
 * @author samuraipanzer
 */
public class FXMLDocumentController implements Initializable {
  
  //@FXML
  //private Label label;
  
  @FXML
  private ToggleButton tButton;
  
  @FXML
  private void handleButtonAction(ActionEvent event) {
	System.out.println("You clicked me!");
	toggleToggleButton(tButton);
	//label.setText("Hello World!");
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
	// TODO
  }  
  
  private void toggleToggleButton(ToggleButton tButton){
	tButton.setSelected(!tButton.isSelected());
  }
  
}
