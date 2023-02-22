package java_homework;

public class Homework {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isRain  = false;
        boolean canWalk = isWeekend == true && isRain == false;

        System.out.println(canWalk);


        boolean isEdekaOpen = false;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen == true || isReweOpen == true;

        if (canBuy == true){
            System.out.println("Я могу купить еду, это - " + canBuy);
        } else {
            System.out.println("Я могу купить еду, это - " + canBuy);
        }


        int temperature1 = 120;
        int temperature2 = 23;

        result(temperature1, temperature2);
    }

    public static void result (int temperature1, int temperature2){
        boolean operability = temperature1 > 100 && temperature2 < 100;
        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println(operability);
        } else {
            System.out.println(operability);
        }
    }
}
