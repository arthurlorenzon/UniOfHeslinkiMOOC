
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
        int price = this.princePerSquare * this.squares;
        int priceCompared = compared.princePerSquare * compared.squares;
        return Math.abs(price - priceCompared);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int priceCompared = compared.princePerSquare * compared.squares;
        if (price > priceCompared) {
            return true;
        }
        return false;
    }
}
