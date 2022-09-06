import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental : rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();

            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.calculateCharge()) + "\n";
            totalAmount += rental.calculateCharge();
        }

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + "frequent renter points";

        return result;
    }

    public String getName() {
        return name;
    }
}
