 
public class Money {
 
    private final int euros;
    private final int cents;
 
    public Money(int euros, int cents) {
 
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
 
        this.euros = euros;
        this.cents = cents;
    }
 
    public int euros() {
        return this.euros;
    }
 
    public int cents() {
        return this.cents;
    }
 
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
 
        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros();
        int newCents = this.cents();
        
        newEuros += addition.euros;
        newCents += addition.cents;
        
        //The word final used in the definition of object variables catches attention. The result of this word
        //is that the values of these object variables cannot be modified after they have been set in the constructor.
        
        Money newMoney = new Money(newEuros, newCents); // create a new Money object that has the correct worth
        
     
        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros; //7
        int newCents = this.cents - decreaser.cents; //-50
        
        if (newCents < 0) {
            newCents = newCents + 100;
            newEuros = newEuros - 1;
        }
        
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
 
}
