package Task_1;
import java.util.Scanner;

public class PalindromeFinder {
    public static void main (String[] args){
        System.out.println("This code will help you to figure out is the number you enter is palindrome or not.");
        System.out.println("Please, enter your number: ");
        int enteredNumber = new Scanner(System.in).nextInt();

        if (EnteredNumberCalculation(enteredNumber)){
            System.out.println("Number " + enteredNumber + " is a palindrome.");
        }
        else {
            System.out.println("Number " + enteredNumber + " is NOT a palindrome.");
        }
    }

    public static boolean EnteredNumberCalculation(int number) {
        int calculation = number;
        int reverse = 0;
        while (calculation !=0){
            int remainder = calculation%10;
            reverse = reverse * 10 + remainder;
            calculation=calculation/10;
        }
        return number == reverse;
    }

}