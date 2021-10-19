package inheritance;
import java.util.ArrayList;
public class Shop extends Review implements Reviewable  {
    private String name;
    private String description;
    private int dollarSigns;
    protected ArrayList<Review> reviews = new ArrayList<>();

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;

    }

    public Shop() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDollarSigns() {
        return dollarSigns;
    }
    public String toString(){
        String result;
        result= "the Shop "+this.name + " has " +this.description +" AS RATE " + this.dollarSigns +"$";
        return  result;

    }

    @Override
    public void addReview(Review review) {
        this.getReviews().add(review);
        int sum = 0;
        for (Review val: this.getReviews()) {
            sum += val.getStars();
        }
        this.setStars(sum / this.getReviews().size());
    }

}