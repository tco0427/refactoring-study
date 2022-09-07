package videoStore.movie.price;

import videoStore.movie.Movie;

public class RegularPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
