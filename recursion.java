import java.util.Scanner;
import java.lang.String;

public class recursion {
    public static void main(String[] args) {
        //call your recursion function
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        scanner.close();

//        print result
        if (recursionFunction(string)) {
            System.out.println(string + " is Palindrome.");
        }
        else{
            System.out.println(string + " is not Palindrome");
        }
    }


    public static boolean recursionFunction(String str) {
        //implement your case algorithm
        if (str.isEmpty() || str.length() == 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            return recursionFunction(str.substring(1, str.length() - 1));
        }
    }
}  