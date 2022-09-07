package videoStore.movie.price;

import videoStore.movie.Movie;

public class ChildrenPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
