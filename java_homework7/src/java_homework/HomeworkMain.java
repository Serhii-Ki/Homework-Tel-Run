package java_homework;

import java.util.Arrays;

public class HomeworkMain {
    public static void main(String[] args) {
        int[] array = {2, 12, 67, 3, 23, 56, 2, 6, 43, 23, 44, 62, 15};

        Homework.insertionSort(array);
        //System.out.println(Arrays.toString(array));

        Homework.selectionSort(array);
        System.out.println(array);
    }

}
