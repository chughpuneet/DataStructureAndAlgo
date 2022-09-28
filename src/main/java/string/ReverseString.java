package main.java.string;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Hi my name is Puneet";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        String reversed = "";

        char[] chars = s.toCharArray();

        for(int i=chars.length-1; i>=0; i--){
            reversed = reversed + chars[i];
        }

        return reversed;

    }


}
