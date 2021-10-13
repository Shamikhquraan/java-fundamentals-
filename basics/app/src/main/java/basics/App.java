package basics;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {

        //------------------------Function 1-------------------------

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        //------------------------Function 2-------------------------
        flipNHeads(1);
        clock();
    }



    public static String pluralize(String word , int number ){

        if (number ==0 || number >1  ){

            return word + "s";
        } else {
            return word;
        }

    }


    public static void flipNHeads (int n){

        int numFlibs= 0;
        int slrFlibs= 0;

        while (slrFlibs !=n){

            int random = (int) Math.floor(Math.random() * (1 + 1) + 0);

            if (random >.5) {
                System.out.println("heads");
                numFlibs++;
                slrFlibs++;

            }else{
                System.out.println("tails");
                slrFlibs=0;
                numFlibs++;

            }
        }
        System.out.println("It took " + numFlibs + " flips to flip " + n + " heads in a row.");

    }

    public static void clock(){


        LocalDateTime now = LocalDateTime.now();

        int second = now.getSecond();
        int second1=now.getSecond();
        int num=1;
        while(true){
            now = LocalDateTime.now();
            int newSecond = now.getSecond();
            if(second != newSecond){
                System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
                second=now.getSecond();
                if(second1 == newSecond){
                    System.out.println( "breaked at time => "+now.getHour() + ":" + now.getMinute() + ":" + (now.getSecond()+num));

                    break;
                }

            }
        }

    }

    public Object getGreeting() {
        return null;
    }
}
