package videoStore.movie.price;

public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(final int daysRented);

    public int getFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
