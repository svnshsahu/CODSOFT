import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects");
        double num = sc.nextInt();
        double max_number = num * 100;
        double sum = 0;
        double a = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter marks obtained in subject " + i);
            a = sc.nextDouble();
            sum = sum + a;
        }
        System.out.println("Marks: " + (int) sum+" Out of "+(int)max_number);

        double per = (sum * 100 / max_number);

        System.out.println("Percentage: " + per + "%");

        if (per >= 90) {
            System.out.println("Grade: A");
        } else if (per >= 75) {
            System.out.println("Grade: B");
        } else if (per >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        sc.close();
    }
    

}
