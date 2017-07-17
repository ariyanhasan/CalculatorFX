package com.mdhasan.mycalculatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class FXMLController implements Initializable {
    
     @FXML
    public Label Display;
     public String resultTxt="";
    private Double Number1;
    private String operator="";
    private boolean bol =true;
    String clear;
    
    
    
    
    
    Calculation cal=new Calculation();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Display.setStyle(
                "-fx-background-color: rgba(255, 255, 255, 0.5);");
    }    

    

    @FXML
    private void operators(ActionEvent event) {
        String object=((Button)event.getSource()).getText();
        
        
        
        if (!object.equals("=")){
            
            if(!operator.isEmpty()){
                return;
            }
            operator = object;
            Number1 = Double.parseDouble(Display.getText());
            Display.setText("");
            resultTxt=resultTxt+object;
          
            
            
        }else {
            
            if(operator.isEmpty()){
                return;
            }
            double Number2=Double.parseDouble(Display.getText());
            
            double output = cal.calculate(Number1,Number2,operator);
            
            Display.setText(String.valueOf(output));
            operator="";
            bol=true;
            
            resultTxt=resultTxt+" = "+Display.getText();
            
        }
        
        
    }

    @FXML
    private void Numbers(ActionEvent event) {
        
        if (bol) {
            Display.setText("");
            bol = false;
            
            
        }
        
        String object=((Button)event.getSource()).getText();
        String oldText=Display.getText();
        String newTxt=oldText+object;
        
        Display.setText(newTxt);
        
        resultTxt=newTxt;
        
    }
    
    @FXML
    void AllClear(ActionEvent event) {
        Display.setText(" ");
        Number1=0d;
        bol=true;
        
        resultTxt="";

    }
    
    

      
}
