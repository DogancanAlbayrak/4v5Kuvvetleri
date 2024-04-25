import java.util.Scanner; // Indicates that our code includes the Scanner class.

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// Creates an object from the Scanner class to get input from the user.

        int n;// Declares a variable to hold the limit value determined by the user.

        System.out.print("Sınır Sayısını Giriniz : ");// Prompts the user to enter the limit number.
        n = input.nextInt();// Takes the value entered by the user.

        int i; //Declares a variable to be used in the loop.

        System.out.println("4'ün kuvvetleri : ");
        for (i = 1; i <= n; i *= 4) { // Uses a for loop to calculate the powers of 4.
            System.out.println(i);// Prints each power of 4.
        }
        System.out.println("5'in kuvvetleri : ");
        for (i = 1; i <= n; i *= 5) {// Uses a for loop to calculate the powers of 5.
            System.out.println(i);// Prints each power of 5.
        }
    }
}