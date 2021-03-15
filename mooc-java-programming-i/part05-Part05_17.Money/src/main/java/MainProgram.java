 
public class MainProgram {
 
    public static void main(String[] args) {
        Money firstMoneyObject = new Money(1, 0);
        Money thirdMoneyObject = new Money(-3,5);
           
 
        System.out.println(thirdMoneyObject.lessThan(firstMoneyObject));  // false
 
    }
}
