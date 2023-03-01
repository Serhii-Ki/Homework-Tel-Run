package java_homework;

public class HomeworkPart2 {

    public static int numberOfLifts(int floors, int stepUp, int stepDown) {
        int sum = 0;
        int iterationCount = 0;
        while (sum <= floors) {
            sum = sum + stepUp - stepDown;
            iterationCount++;
        }
        return iterationCount - 1;
    }

    public static void main(String[] args) {
        int itCount = numberOfLifts(200, 50, 1);
        System.out.println("Лифт совершает :" + itCount + " подъемов!");
    }
}
