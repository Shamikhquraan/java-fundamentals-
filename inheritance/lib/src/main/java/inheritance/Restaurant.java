package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    double sumOfStars;
    String price;
    ArrayList<Review> reviewList = new ArrayList<>();



    public Restaurant(String name, double sumOfStars, String price) {
        this.name = name;
        this.sumOfStars = sumOfStars;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return (int) sumOfStars;
    }

    public void setStars(int stars) {

        if (stars>0 || stars <6)
            this.sumOfStars = stars;
        else {
            System.out.println("  Ooops!range must be between 0 and 5 ");
        }

    }

    public String getPriceCategory() {
        return price;
    }

    public String toString(){
        String rating = "Restaurant: " + this.name + " \n" + " rating : " + this.sumOfStars + " \n" + " price category: " + this.price+ "$";

        return rating;
    }

    public double addReview(String body,String author,int numOfStars) {
        Review review = new Review(body,author,numOfStars);
        reviewList.add(review);
        this.sumOfStars =(this.sumOfStars+review.numOfStars)/2;
//        System.out.println(review.test());
        return this.sumOfStars;

    }
}