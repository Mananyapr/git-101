import models.General;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String id = scanner.nextLine();
        double age = scanner.nextDouble();
        General general = new General(id, name, surname, age);


        System.out.println("Name : " + general.getName());
        System.out.println("Surname : " + general.getSurname());
        System.out.println("Student ID : " + general.getId());
        System.out.println("Age : " + general.getAge());

    }
}
