
public class CashRegister {
    
    private double price, payment, cashback;
    private int pennyback = 0, nickelback = 0, dimeback = 0, 
            quarterback = 0,halfback = 0, oneback = 0, twoback = 0, fiveback =0, 
            tenback = 0, twentyback = 0, fiftyback = 0, hundredback = 0;
    
    public void setPrice(double price){
        
        this.price=price;
    }
    
    public void setPayment(double payment){
        
        this.payment=payment;
    }
    
    public void CashBack(){
        
        System.out.println("price = " + price);
        System.out.println("payment = " + payment);
        
        if (payment == price){
            
            System.out.println("Give change of 0");
        }
        
        else if (payment < price){
            
            System.out.println("not enough money to buy");
        }
        
        else {
            
            cashback = payment - price;
            System.out.println("Give change of " + cashback);
            
            while (cashback >= 0.01){
                
                if (cashback >= 100) {
                
                cashback -= 100;
                hundredback ++;
                } 
                
                else if (cashback >= 50) {
                
                cashback -= 50;
                fiftyback ++;
                } 
                
                else if (cashback >= 20) {
                
                cashback -= 20;
                twentyback ++;
                } 
                
                else if (cashback >= 10) {
                
                cashback -= 10;
                tenback ++;
                } 
                
                else if (cashback >= 5) {
                
                cashback -= 5;
                fiveback ++;
                } 
                
                else if (cashback >= 2) {
                
                cashback -= 2;
                twoback ++;
                } 
                
                else if (cashback >= 1) {
                
                cashback -= 1;
                oneback ++;
                } 
                
                else if (cashback >= 0.5) {
                
                cashback -= 0.5;
                halfback ++;
                } 
                
                else if (cashback >= 0.25) {
                
                cashback -= 0.25;
                quarterback ++;
                } 
                
                else if (cashback >= 0.1) {
                
                cashback -= 0.1;
                dimeback ++;
                } 
                
                else if (cashback >= 0.05) {
                
                cashback -= 0.05;
                nickelback ++;
                } 
                
                else {
                
                cashback -= 0.01;
                pennyback ++;
                }
            }
            
            System.out.println("You will receive:");
            System.out.println(hundredback + "x 100$");
            System.out.println(fiftyback + "x 50$");
            System.out.println(twentyback + "x 20$");
            System.out.println(tenback + "x 10$");
            System.out.println(fiveback + "x 5$");
            System.out.println(twoback + "x 2$");
            System.out.println(oneback + "x 1$");
            System.out.println(halfback + "x 0.5$");
            System.out.println(quarterback + "x 0.25$");
            System.out.println(dimeback + "x 0.1$");
            System.out.println(nickelback + "x 0.05$");
            System.out.println(pennyback + "x 0.01$");
        }
    }
}
