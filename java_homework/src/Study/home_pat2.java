package Study;

public class home_pat2 {
    String str = "I study Basic Java!";

    public void getStr (){
        System.out.println(str);
    }

    public void getStr2 (){
        System.out.println(str.charAt(18));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(13,18));
    }
}
