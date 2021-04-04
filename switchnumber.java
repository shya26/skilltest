import java.util.Scanner;

public class switchnumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("first + second");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("50 (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(first + "10 " + operator + "50 " + second + " = " + result);
    }
}

