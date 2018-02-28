import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        charFinder('A');
        charFinder('B');
        charFinder('C');
        charFinder('D');
        charFinder('E');
        charFinder('F');
        charFinder('1');
        charFinder('a');
    }

    public static void charFinder(char symbol) {
        switch(symbol) {
            case 'A' :
                System.out.println("It is A character...");
                break;
            case 'B':
                System.out.println("It is B character...");
                break;
            case 'C':
                System.out.println("It is C character...");
                break;
            case 'D':
                System.out.println("It is D character...");
                break;
            case 'E':
                System.out.println("It is E character...");
                break;
            default:
                System.out.println("Character which was written is unknown. Please try another one!");
        }
    }
}
