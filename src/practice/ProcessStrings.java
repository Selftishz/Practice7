package practice;

public class ProcessStrings implements StringOperations {

    public int length(String s) {
        return s.length();
    }

    public String oddPos(String s) {
        String newString = "";
        int i = 0, j = 0;
        while (i != s.length()) {
            if (j % 2 != 0) {
                newString += s.charAt(i);
                i++;
            } else newString += "_";
            j++;
        }
        return newString;
    }

    @Override
    public String invert(String s) {
        String newString = "";
        for (int i = length(s)-1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        return newString;
    }
}
