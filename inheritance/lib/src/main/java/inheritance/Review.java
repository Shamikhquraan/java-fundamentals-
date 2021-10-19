package inheritance;

public class Review {
    private   String body;
    private  String author;
    public int Stars;
    private Restaurant restaurant;

    public Review(String body, String author, int Stars) {
        this.body = body;
        this.author = author;
        this.Stars = Stars;
    }
    public Review() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int setStars(int stars) {

        if(stars <= 5 && stars >= 0){
            this.Stars = stars;
return stars;
        }else{
            System.out.println("The stars should be between 0 - 5");
        }

        return -1;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return Stars;
    }

    public String toString(){
        String result;
        int sStar = setStars(this.Stars);
        if(sStar == -1){
            return "The stars should be between 0 - 5" ;
        }
            result = this.body + " " + this.author + " voted " + this.Stars + " stars.";
            return result;
    }


}