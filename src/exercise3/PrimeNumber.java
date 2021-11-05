package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 2;
        int a;
        boolean prime = true;
        a = input.nextInt();
        
        while (i < a){
          if (a % i == 0){
            prime = false;
            break;
          }
          i++;
        }
        
        System.out.println("Prime number: " + prime);
        }
   
    }

