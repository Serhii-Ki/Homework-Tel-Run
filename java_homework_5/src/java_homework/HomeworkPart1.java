package java_homework;

public class HomeworkPart1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Это строка номер" + i);
        }

        for (int i = 40; i >= 20; i--) {
            System.out.println(i);
        }
        
        int sum = 0;
        for (int i = 20; i <=60 ; i++) {
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
