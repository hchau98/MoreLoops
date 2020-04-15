import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        int num1 = 0;

        System.out.println("Even Numbers:");
        for (num1 = 1; num1 <= 20; num1 += 1) {
            if (num1 % 2 == 0)
                System.out.println(num1);
        }
        System.out.println("Odd Numbers:");
        for (num1 = 1; num1 <= 20; num1 += 1) {
            if (num1 % 2 == 0) ;
            else {
                System.out.println(num1);
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num5 = input.nextInt();
        System.out.println("The factors of this number are: ");
            for (int num4 = 1; num4 <= num5; num4++) {
                if (num5 % num4 == 0) {
                    System.out.print(num4+" ");
                }

            }
        System.out.println("\nEnter a Number: ");
        long num7 = input.nextInt();
        System.out.println("\nThe factorial of this number is: ");
        int num6=1;
            for (int num8 = 1 ; num8 <= num7;num8++){
                num6 *= num8;
            }
        System.out.println(num6);

        input.nextLine();
        System.out.println("\nEnter a word: ");
        String words = input.nextLine();
        int num2;
            for (num2 = words.length() - 1; num2 >= 0; num2--) {
                System.out.print(words.charAt(num2));

            }

        }
    }

