package inheritance;

public class Review {
    String body;
    String author;
    int numOfStars;
    private Restaurant restaurant;

    public Review(String body, String author, int numOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }
    public Review() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setStars(int stars) {

        if(stars <= 5 && stars >= 0){
            this.numOfStars = stars;

        }else{
            System.out.println("The stars should be between 0 - 5");
        }

    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return numOfStars;
    }

    public String toString(){
        String result;
        result= "the Restaurant "+this.body+" "+this.author + "voted " +this.numOfStars +" stars." ;
        return  result;

    }

}