import java.util.ArrayList;
import java.util.Scanner;

public class limitedNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Please enter numbers. It will stop when you enter a negative number.");
            double num = input.nextDouble();
            if (num < 0) {
                break;
            }
            numbers.add((int) num);
        }
        numbers.stream()
                .filter(number -> number <= 5 && number >=1)
                .forEach(System.out::println);
    }
}
