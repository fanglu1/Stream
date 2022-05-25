import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class avgOfSelectNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Enter any number, positive or negative. Type end to stop.");
        while(true) {
            String num = input.nextLine();
            if (num.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(num);
        }
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String negOrPos = input.nextLine();
            if(negOrPos.equalsIgnoreCase("n")){
                double average = inputs.stream()
                        .mapToInt(Integer::valueOf)
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average negative number is: " + average);
            }
            if(negOrPos.equalsIgnoreCase("p")){
                double average = inputs.stream()
                        .mapToInt(Integer::valueOf)
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
                System.out.println("Average positive number is: " + average);
            }
        }
    }
