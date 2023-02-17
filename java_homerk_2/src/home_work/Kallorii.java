package home_work;

public class Kallorii {
    public static void main(String[] args) {
    int diamPizzaBig = 28;
    int diamPizzaMedium = 24;
    int kalloriiPizza = 40;

    int resultKallorii = howMuchKallorii(diamPizzaBig, diamPizzaMedium, kalloriiPizza);
        System.out.println("+ " + resultKallorii + " Kallorii");
    }
    public static int howMuchKallorii (int diamPizzaBig, int diamPizzaMedium, int kalloriiPizza){
        int result = (diamPizzaBig * kalloriiPizza) - (diamPizzaMedium * kalloriiPizza);
        return result;
    }
}
