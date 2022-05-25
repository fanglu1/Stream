import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class printingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> userInputs = new ArrayList<>();
        while (true) {
            System.out.println("Enter words. Press enter to stop.");
            String userInputStuff = input.nextLine();
            if (userInputStuff.equals("")) {
                break;
            }
            userInputs.add(userInputStuff);
        }
        new ArrayList<>(userInputs);
        userInputs.forEach(System.out::println);
    }
}
