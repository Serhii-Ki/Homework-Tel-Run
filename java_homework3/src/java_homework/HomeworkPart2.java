package java_homework;

public class HomeworkPart2 {
    public static void main(String[] args) {

        int n = 2;

        if (n==28800) {
            System.out.println("Осталось :" + n + "сек");
            System.out.println("Осталось :" + (n / 3600) + "часов");
        }
        if (n< 28800 && n >= 25200){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 25200 && n >= 21600){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 21600 && n >= 18000){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 18000 && n >= 14400){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 14400 && n >= 10800){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 18000 && n >= 7200){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 7200 && n >= 3600){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось :" + (n/3600)+ " часов");
        }
        if (n< 3600 && n > 0){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Осталось : Менее часа");
        }
        if (n==0){
            System.out.println("Осталось :" + n + " сек");
            System.out.println("Пора домой");
        }
    }
}
