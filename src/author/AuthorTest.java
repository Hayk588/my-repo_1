package author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        System.out.println("Qani hat Hexinak unenq");
        int authorCount = scanner.nextInt();
        for (int i = 0; i < authorCount; i++) {
            String s = scanner.next();
            System.out.println("Name");
            String sur = scanner.next();
            System.out.println("SurName");
            String na = scanner.next();
            System.out.println("Email");
            String em = scanner.next();
            System.out.println("Age");
            int age = scanner.nextInt();
            System.out.println("Gendar");
            String gen = scanner.next();
            authorStorage.add(new Author(sur,na,em,age,gen));
        }
        authorStorage.print();
    }
}