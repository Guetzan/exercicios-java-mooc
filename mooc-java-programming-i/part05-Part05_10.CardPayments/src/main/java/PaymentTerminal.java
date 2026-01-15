public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_MEAL_PRICE = 2.50;    
    private static final double HEARTY_MEAL_PRICE = 4.30;


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= this.AFFORDABLE_MEAL_PRICE) {
            card.takeMoney(this.AFFORDABLE_MEAL_PRICE);
            this.affordableMeals++;
            
            return true;
        }
        
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= this.HEARTY_MEAL_PRICE) {
            card.takeMoney(this.HEARTY_MEAL_PRICE);
            this.heartyMeals++;
            
            return true;
        }
        
        return false;  
    }

    public double eatAffordably(double payment) {
        if(payment >= this.AFFORDABLE_MEAL_PRICE) {
            this.money += this.AFFORDABLE_MEAL_PRICE;
            this.affordableMeals++;
            
            return payment - this.AFFORDABLE_MEAL_PRICE;
        }
        
        return payment;
    }

    public double eatHeartily(double payment) {
        if(payment >= this.HEARTY_MEAL_PRICE) {
            this.money += this.HEARTY_MEAL_PRICE;
            this.heartyMeals++;
            
            return payment - this.HEARTY_MEAL_PRICE;
        }
        
        return payment;
    }
    
    public void addMoneyToCard(PaymentCard card, double amount) {
        if(amount > 0) {
            card.addMoney(amount);
            this.money += amount;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
