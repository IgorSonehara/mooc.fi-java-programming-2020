 
public class Apartment {
 
    private int rooms;
    private int squares;
    private int princePerSquare;
 
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int ownAbsoluteValue = this.squares * this.princePerSquare;
        int comparedAbsoluteValue = compared.squares * compared.princePerSquare;
        
        if (ownAbsoluteValue > comparedAbsoluteValue) {
            return ownAbsoluteValue - comparedAbsoluteValue;
        }
        
        if (comparedAbsoluteValue > ownAbsoluteValue) {
            return comparedAbsoluteValue - ownAbsoluteValue;
        }
        
        return 0;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int ownAbsoluteValue = this.squares * this.princePerSquare;
        int comparedAbsoluteValue = compared.squares * compared.princePerSquare;
        
        if (ownAbsoluteValue > comparedAbsoluteValue) {
            return true;
        } else {
            return false;
        }        
    }
 
}
