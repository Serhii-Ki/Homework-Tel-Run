package homework;

import java.util.Random;

public class MaxNum {
    public static void main(String[] args) {
        int num = new Random().nextInt(99, 1000);

        int thirdNum = num % 10;
        int secondNum = (num - thirdNum) % 10;
        int firstNum = num / 100;

        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println(firstNum);
        } else if (secondNum > firstNum && secondNum > firstNum) {
            System.out.println(secondNum);
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println(thirdNum);
        } else {
            System.out.println("numbers are equal to" + num);
        }
    }

}
