package java_homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        // Задача №1
        int a = 5;
        int[] array = new int[]{1, 2, 4, 5};
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i){
                num = i;
            }
        }
        System.out.println(num);



        // Задача №2
        int N = 6;
        int K = 7;
        int[] arr = new int[N];
        Random random = new Random();
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < N ; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i]+arr[j] == K){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + K);
                    result++;
                }
            }
        }
        System.out.println("Всего " + result + " выражения");

    }
}
