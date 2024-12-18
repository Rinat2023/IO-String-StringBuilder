
public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello world"));
    }

    public static String getReverseString(String str) {
        StringBuilder strB = new StringBuilder(str);
        strB.reverse();
        return strB.toString();
    }

    public static String removeDuplicates(String input) {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (strB.indexOf(String.valueOf(currentChar)) == -1) {
                strB.append(currentChar);
            }
        }
        return strB.toString();
    }

}