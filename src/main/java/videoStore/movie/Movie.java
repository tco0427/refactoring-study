package videoStore.movie;

import videoStore.movie.price.ChildrenPrice;
import videoStore.movie.price.NewReleasePrice;
import videoStore.movie.price.Price;
import videoStore.movie.price.RegularPrice;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(final String title, final int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch(priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(final int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(final int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }
}
