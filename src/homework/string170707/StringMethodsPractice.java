package homework.string170707;


public class StringMethodsPractice {


    public static String trim(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        if (s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1) {
            return s;

        }

        int start = 0;
        int stop = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !=' ' && start == 0) {
                start = i;
                break;
            }
        }
        for (int i = s.length()-1; i > 0; i--) {
            if (s.charAt(i) !=' ' && stop == 0) {
                stop = i;
                break;
            }
        }

        return s.substring(start, stop + 1);

    }

    public static String replace(String s, char oldChar , char  newChar) {
        if (s == null || s.length() == 0) {
            return s;
        }
        if (oldChar == newChar) {
            return s;
        }

        StringBuilder newString = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length ; i++) {
            if (charArray[i] == oldChar){
                newString.append(newChar);
            } else {
                newString.append(charArray[i]);
            }

        }

        return newString.toString();
    }
}

