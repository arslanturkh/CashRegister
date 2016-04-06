/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H.ONUR
 */
public class Coin {
    
    private double value;
    private double penny = 0.01, nickel = 0.05, dime = 0.1, 
            quarter = 0.25,half = 0.5, one = 1, two = 2, five = 5, 
            ten = 10, twenty = 20, fifty = 50, hundred = 100;
    
    public void getvalue(){
        
        System.out.println("Coin value is " + value);
    }
    
    
    public double valueOfCoin(double values){
        
        if (values == penny){
            value = penny;
        }
        
        else if (values == nickel){
            value = nickel;
        }
        
        else if (values == dime){
            value = dime;
        }
        
        else if (values == quarter){
            value = quarter;
        }
        
        else if (values == half){
            value = half;
        }
        
        else if (values == one){
            value = one;
        }
        
        else if (values == two){
            value = two;
        }
        
        else if (values == five){
            value = five;
        }
        
        else if (values == ten){
            value = ten;
        }
        
        else if (values == twenty){
            value = twenty;
        }
        
        else if (values == fifty){
            value = fifty;
        }
        
        else if (values == hundred){
            value = hundred;
        }
        
        else {
            System.out.println("invalid coin value. Coin is set to " + value);
        }
        
        return value;
    }
}
