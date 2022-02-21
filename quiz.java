import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1=sc.nextLine();

        System.out.println("2.  Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars");
        String answer2=sc.nextLine();

        System.out.println("3.  What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-NEGATIVE");
        String answer3=sc.nextLine();

        System.out.println("4.  Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc)  Draco Malfoy\n\td) AB-NEGATIVE");
        String answer4=sc.nextLine();
        int score=0;
        if(answer1.equals("c")){
            score +=5;
        }
        if(answer2.equals("a")){
            score +=5;
        }
        if (answer3.equals("d")){
            score +=5;
        }
        if (answer4.equals("a") || answer4.equals("b")){
            score +=5;
        }
        System.out.println("Your final score is :"+score+"/20");

        if(score>=15){
            System.out.println("Wow you know your stuff ");
        }else if(score>=5 && score<=15){
            System.out.println("not bad");
        }else{
            System.out.println("better luck for next time");
        }

    }
     
}
