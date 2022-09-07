package videoStore.movie.price;

import videoStore.movie.Movie;

public class ChildrenPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
}
