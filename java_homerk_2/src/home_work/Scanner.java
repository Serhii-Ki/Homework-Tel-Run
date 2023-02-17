package home_work;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner text = new java.util.Scanner(System.in);
        System.out.println("Введите текст, например:Мирное небо");
        String partText = text.nextLine();
        System.out.println(partText.substring(0,2) + partText.substring(7,9));
    }
}
