package java_homework;

import java.util.concurrent.ThreadLocalRandom;

public class HomeworkRandom {
    public static void main(String[] args) {
        int numberStudents = 18;
        students(numberStudents);
    }
    public static void students (int numberStudents){
        System.out.println(ThreadLocalRandom.current().nextInt(2,numberStudents));
    }
}
