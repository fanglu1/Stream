import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class positiveNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        System.out.println("Enter any number, positive or negative. Enter end to stop.");
        while(true) {
            String num = input.nextLine();
            if (num.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(Integer.valueOf(num));
        }
        positive(inputs);
    }
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> posNum = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new ));
                posNum.forEach(System.out::println);
                return posNum;
    }
}
