package homework;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int numbers = scanner.nextInt();

        int thirdNum = numbers % 10;
        int secondNum = (numbers - thirdNum) % 10;
        int firstNum = numbers / 100;
        System.out.println(firstNum + secondNum + thirdNum);
    }

}
