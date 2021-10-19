package inheritance;

import java.util.ArrayList;

public class Restaurant extends Review implements Reviewable{
    private String name ="";
    private int stars =0;
    private int priceCategory= 0;
    protected ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant() {

    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public Restaurant (String name , int stars , int priceCategory ){
        this.name=name ;
        this.stars=stars;
        this.priceCategory=priceCategory;

    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int setStars(int stars) {

        if (stars>0 || stars <6)
            this.stars = stars;
        else {
            System.out.println("  Ooops!range must be between 0 and 5 ");
        }

        return stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }


    public String toString(){
        String result;
        result= "the Restaurant "+this.name + "has " +this.stars +" AS RATE " + this.priceCategory +"$";
        return  result;}

    public void addReview(Review review){
        this.getReviews().add(review);
        int sum = 0;
        for (Review val: this.getReviews()) {
            sum += val.getStars();
        }
        this.setStars(sum / this.getReviews().size());
    }

}