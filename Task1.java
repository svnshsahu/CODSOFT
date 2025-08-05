import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Random r = new Random();
        int Random_number = r.nextInt(1, 101);

        System.out.println("Welcome to game of guessing random number");
        System.out.println("***********************************************************************");
        System.out.println("There are 5 instructions to help you to reach till random number");
        System.out.println("1.Very High Differnce");
        System.out.println("2.High Differnce");
        System.out.println("3.Small Difference");
        System.out.println("4.Very Small Difference");
        System.out.println("5.Very Very Small Difference");
        System.out.println();
        System.out.println("If you want to end the game in mid-way press '101' ");
        System.out.println();
        System.out.println("***********************************************************************");
        System.out.println(
                "Enter any number between 1 to 100 and try to match your number with computer generated random number");
        Scanner sc = new Scanner(System.in);
        String Exit = "Y";

        int input_number = 0;
        int count = 1;

        while (true) {
            input_number = sc.nextInt();
            if (input_number == Random_number) {
                System.out.println(
                        "Congrats you have entered the correct random number in " + count + " number of attempts");
                break;

            } else if (input_number - Random_number > 50 || input_number - Random_number < -50 || input_number == 101) {
                if (input_number == 101) {
                    System.out.println("You Lost , the correct number was " + Random_number);
                    break;
                }
                System.out.println("Very high difference");
                count = count + 1;

            } else if (input_number - Random_number > 25 || input_number - Random_number < -25 || input_number == 101) {
                if (input_number == 101) {
                    System.out.println("You Lost , the correct number was " + Random_number);
                    break;
                }
                System.out.println("High difference");
                count = count + 1;
            } else if (input_number - Random_number > 10 || input_number - Random_number < -10 || input_number == 101) {
                if (input_number == 101) {
                    System.out.println("You Lost , the correct number was " + Random_number);
                    break;
                }

                System.out.println("Small difference");
                count = count + 1;
            } else if (input_number - Random_number > 5 || input_number - Random_number < -5 || input_number == 101){
                if (input_number == 101) {
                    System.out.println("You Lost , the correct number was " + Random_number);
                    break;
                }
                System.out.println("Very Small difference");
                count = count + 1;
            }
            else{
                  if (input_number == 101) {
                    System.out.println("You Lost , the correct number was " + Random_number);
                    break;
                }
                System.out.println("Very Very Small difference");
                count = count + 1;

            }
        }

    }

}
