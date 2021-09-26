/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author shivanginagar
 */
public class Validations {

    public static boolean checkValidationsForName(String text) {
        return text.matches("[a-zA-Z]+");
    }

    public static boolean checkValidationsForGeoData(String text) {
        return text.matches("[a-zA-Z]+");
    }
    
    public static boolean checkValidationsForDOB(String text) {
        return text.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}");
    }

    public static boolean checkValidationsForTelNum(String text) {
        return text.matches("[0-9]{10}");
    }
    
    public static boolean checkValidationsForFaxNum(String text) {
        return text.matches("[0-9]{11}");
    }
    
    public static boolean checkValidationsForEmail(String text) {
        return text.matches("^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{3}$");
        
    }
    
    public static boolean checkValidationsForSSN(String text) {
        return text.matches("[0-9]{9}");
        
    }
    
    public static boolean checkValidationsForMRN(String text) {
        return text.matches("[0-9]{6}");
        
    }
    
    public static boolean checkValidationsForHBPN(String text) {
        return text.matches("[0-9]{1,}");
        
    }
    
    public static boolean checkValidationsForBankaccnum(String text) {
        return text.matches("[0-9]{12}");
        
    }
    
    public static boolean checkValidationsForVehicleID(String text) {
        return text.matches("^[a-zA-Z0-9]+$");   
        
    }
    
    public static boolean checkValidationsForDeviceID(String text) {
        return text.matches("^[a-zA-Z0-9]+$");   
        
    }
    
    public static boolean checkValidationsForLicensenumber(String text) {
        return text.matches("^[a-zA-Z0-9]+$");  
        
    }

    public static boolean checkValidationsForLinkedin(String text) {
        return text.matches("^https?://((www|\\w\\w)\\.)?linkedin.com/((in/[^/]+/?)|(/[^/]+/((\\w|\\d)+/?){3}))$");
    }
    
    public static boolean checkValidationsForIPAddress(String text) {
        return text.matches("^((?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]){3}(?:[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
    }
    
    public static boolean checkValidationsForUniqueCode(String text) {
        return text.matches("^[a-zA-Z0-9]+$"); 
    }    
    
}
