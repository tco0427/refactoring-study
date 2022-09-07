package videoStore.movie.price;

import videoStore.movie.Movie;

public class NewReleasePrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
