package java_homework;

public class Homework {
    public static void main(String[] args) {
        //1 Задача вызов
        System.out.println(twoStringsRevers("Hello", "Serhii"));

        //2 Задача вызов
        String[] arr = {"I", " ", "l", "i", "k", "?", " ", "J", "a", "v", "a"};
        System.out.println(word(arr));

        //3 Задача вызов
        reversWord("I like Java");
    }

    //1 Задача
    public static StringBuilder twoStringsRevers (String first, String second){
        StringBuilder twoString = new StringBuilder();
        return twoString.append(first + second).reverse();

    }
    //2 Задача
    public static String word (String arr[]){
        String myWord = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "?"){
                arr[i] = "e";
            }
            myWord +=arr[i];
        }
        return myWord;
    }
    //3 Задача
    public static void reversWord (String str){
        StringBuilder reversString = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder strI = new StringBuilder(words[i]);
            reversString.append(strI.reverse() + " ");
        }
        System.out.println(reversString);
    }
}
