package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double posn = 0.0;
        double sum = 0.0;
        double negn = 0.0;
        double nsum = 0.0;
        do {
            System.out.println("Enter numbers: ");
            a = input.nextInt();
            if (a > 0) {
              posn++;
              sum = sum + a;
            }else if (a < 0){
              negn++;
              sum = sum + a;
            }
        } while (a != 0);
        System.out.println("Positive numbers: " + posn);
        System.out.println("Negative numbers:" + negn);
        System.out.println("Sum: " + sum);
        double aver = sum / (posn+negn);
        System.out.println("Average: " + aver);
    }

}
