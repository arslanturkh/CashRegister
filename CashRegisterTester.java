/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H.ONUR
 */
public class CashRegisterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CashRegister cash = new CashRegister();
        
        cash.setPrice(150);
        cash.setPayment(228.48);
        
        cash.CashBack();
        
        Coin valuecash = new Coin();
        System.out.println("Creating coin of 5.00");
        valuecash.valueOfCoin(5);
        System.out.println("Creating coin of 7.00");
        valuecash.valueOfCoin(7);
        
        
        valuecash.getvalue();
    }
    
}
