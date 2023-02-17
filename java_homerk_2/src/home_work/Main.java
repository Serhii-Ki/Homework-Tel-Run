package home_work;

public class Main {
    public static void main(String[] args) {
       int summa =  sumTwoNumbers (3, 7);
        System.out.println(summa);

        int substr = subtractionTwoNumbers(5, 2);
        System.out.println(substr);

        int multiplicat = multiplicationTwoNumbers(6, 7);
        System.out.println(multiplicat);

        int divis = divisionTwoNumbers(9, 3);
        System.out.println(divis);
    }
    public static int sumTwoNumbers (int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int subtractionTwoNumbers (int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }
    public static int multiplicationTwoNumbers (int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }
    public static int divisionTwoNumbers (int num1, int num2){
        int div = num1 / num2;
        return div;
    }
}
