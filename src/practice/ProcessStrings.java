package practice;

public class ProcessStrings implements StringOperations {

    public int length(String s) {
        return s.length();
    }

    public String oddPos(String s) {
        String newString = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j % 2 != 0) {
                newString += s.charAt(j);
                j++;
            } else newString += "_";
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
