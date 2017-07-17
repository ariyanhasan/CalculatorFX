/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mdhasan.mycalculatorfx;

/**
 *
 * @author User
 */
public class Calculation {
    
    public double calculate(double num1, double num2,String operators){
        
        switch(operators){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                if(num2==0)
                    return 0;
                return num1/num2;
            case "%":
                return num1%num2;
            default:
                return 0;
            
            
        }
    
      }
    
}
