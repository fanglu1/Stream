package UniqueLastNameQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uniqueLastName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<person> persons = new ArrayList<>();
        System.out.println("Enter your First Name, Last name and Birth Year.");
    while(true){
        System.out.println("Enter first name:");
        String firstName = input.nextLine();
        System.out.println("Enter last name:");
        String lastName = input.nextLine();
        System.out.println("Enter birth year:");
        int birthYear = Integer.parseInt(input.nextLine());
        persons.add(new person(firstName, lastName, birthYear));
        System.out.println("Continue personal information input? \"quit\" ends");
        String info = input.nextLine();
        if(info.equalsIgnoreCase("quit")){
            break;
        }

    }
    persons.stream()
            .map(person::getLastName)
            .distinct()
            .sorted()
            .forEach(System.out::println);

    }
}
