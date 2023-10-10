package stude;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите любое целое число ...");
        if (number.hasNextInt()) {
            int i = number.nextInt();
            System.out.println("Введенное вами число является целым!");
        } else {
            System.out.println("Введенное вами число не является целым!");
        }
    }
}