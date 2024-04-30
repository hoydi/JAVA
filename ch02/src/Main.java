//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String a = "hello";
        String b = "java";
        String c = "hello";
        String e = new String("hello");
        String f = e;
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        String d = new String("hello");

        System.out.println(a == b);
        System.out.println(a.indexOf("Java"));
        System.out.println(a.contains("Java"));

        int k = 1;
        System.out.println(k--);


    }
}