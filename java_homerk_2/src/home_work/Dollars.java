package home_work;

public class Dollars {
    public static void main(String[] args) {
        double euro1 = 7.5;
        double euro2 = 9.2;
        double courseDollars = 0.94;

        double dollars = calculator(euro1,euro2,courseDollars);
        System.out.println(dollars);
    }
    public static double calculator (double euro1, double euro2, double courseDollars){
        double result = (euro1 + euro2) * courseDollars;
        return result;
    }
}
