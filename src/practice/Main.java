package practice;

public class Main {
    public static void main(String[] args) {
        StringOperations stringOperations = new ProcessStrings();
        String s = "Hello World!";
        System.out.println(stringOperations.oddPos(s));
        System.out.println(stringOperations.length(s));
        System.out.println(stringOperations.invert(s));
    }
}
