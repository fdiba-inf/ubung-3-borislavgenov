package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int posn = 0;
        int sum = 0;
        int negn = 0;
        int nsum = 0;
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
        System.out.println("Average: " + (sum/(posn+negn)));
        System.out.println("End");
    }

}
