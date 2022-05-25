import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class avgNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Enter any number. Type end to stop.");
        while (true) {
            String num = input.nextLine();
            if(num.equalsIgnoreCase("end")){
               break;
            }
            inputs.add(num);
        }
        double average = inputs.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();
        System.out.println("Average number is: " + average);
    }
}
