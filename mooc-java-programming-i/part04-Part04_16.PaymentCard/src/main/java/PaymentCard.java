/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orcsd
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balanceInititalValue) {
        this.balance = balanceInititalValue;
    }
    
    public void eatAffordably() {
        if(this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if(this.balance >= 4.60) {
            this.balance -= 4.60;
        }   
    }
    
    public void addMoney(double value) {
        if(value > 0) {
            this.balance += value;
        }
        
        if(this.balance > 150) {
            this.balance = 150;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
