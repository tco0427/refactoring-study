public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double calculateCharge() {
        return movie.getCharge(daysRented);
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
