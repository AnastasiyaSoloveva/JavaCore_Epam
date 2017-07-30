package codingbat;

public class String2 {

    public String doubleChar(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            res = res + str.charAt(i) + str.charAt(i);
        }
        return res;

    }


    public int countHi(String str) {
        int count = 0;
        String hi = "hi";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(hi)) {
                count++;
            }
        }

        return count;

    }


    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }

        }
        return countCat == countDog;
    }


    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;

    }

    public boolean endOther(String a, String b) {
        String stringWithMinLength = "";

        if (a.length() > b.length()) {
            stringWithMinLength = b;
            b = a;
            a = stringWithMinLength;
        }

        if (a.length() > 0) {
            if (b.substring(b.length() - a.length(), b.length()).toLowerCase().equals(a.toLowerCase())) {
                return true;
            }
        }

        return false;

    }

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && (i == 0 || str.charAt(i - 1) != '.')) {
                return true;
            }
        }
        return false;

    }

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }

        return false;

    }


    public boolean xyBalance(String str) {
        boolean flag = false;
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                flag = true;
                result = false;
            }

            if (flag && str.charAt(i) == 'y') {
                flag = false;
                result = true;
            }
        }

        return result;

    }

    public String mixString(String a, String b) {
        String res = "";
        String longSt = "";
        String shortSt = "";


        if (a.length() < b.length()) {
            shortSt = a;
            longSt = b;
        } else {
            shortSt = b;
            longSt = a;

        }

        for (int i = 0; i < longSt.length(); i++) {
            if (i < shortSt.length()) {
                res = res + a.charAt(i) + b.charAt(i);

            } else {
                res = res + longSt.charAt(i);
            }
        }

        return res;

    }


    public String repeatEnd(String str, int n) {
        String newString = "";
        for (int i = 1; i <= n; i++) {
            newString += str.substring(str.length() - n, str.length());

        }

        return newString;
    }


    public String repeatFront(String str, int n) {
        String newString = str.substring(0, n);

        for (int i = 1; i < n; i++) {
            newString += str.substring(0, n - i);
        }

        return newString;

    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";

        if (count > 0) {
            result = word;
        }
        for (int i = 1; i < count; i++) {
            result = result + sep + word;

        }
        return result;


    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i < str.length() - n + 1; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }

        }

        return false;

    }


    public boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }

        int mid = str.length() / 2;
        if (str.length() % 2 == 1) {
            if ("xyz".equals(str.substring(mid - 1, mid + 2))) {
                return true;
            }

        }

        if (str.length() % 2 == 0) {
            if ("xyz".equals(str.substring(mid - 2, mid + 1))
                    || "xyz".equals(str.substring(mid - 1, mid + 2))) {
                return true;
            }
        }

        return false;

    }


    public String getSandwich(String str) {
        if (str.length() < 5) return "";

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        String res = "";
        if (last != first) {
            res = str.substring(first + 5, last);
        }

        return res;

    }

    public boolean sameStarChar(String str) {
        boolean res = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                res = false;
            }

        }
        return res;

    }


    public String oneTwo(String str) {
        String res = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            res = res + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
        }
        return res;

    }


    public String zipZap(String str) {
        StringBuilder  result = new StringBuilder();
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == 'z' && i+2 < str.length() && str.charAt(i+2) == 'p'){
                result.append(str.charAt(i)).append(str.charAt(i+2));
                i+=2;
            } else{
                result.append(str.charAt(i));
            }
        }

        return result.toString();

    }


    public String starOut(String str) {

        StringBuilder result = new StringBuilder();
        for(int i =0; i < str.length(); i++){
            if (str.charAt(i) == '*') {
                continue;
            } else if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                i += 2;
                continue;
            }
            result.append(str.charAt(i));
        }

        return result.toString();

    }


    public String plusOut(String str, String word) {
        int len = word.length();
        StringBuilder result = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if(i < str.length() - len +1 && str.substring(i, i+len).equals(word)){
                result.append(word);
                i += len - 1;
            } else{
                result.append('+');

            }
        }

        return result.toString();


    }


    public String wordEnds(String str, String word) {

        int len = word.length();
        StringBuilder result = new StringBuilder();

        for(int i=0; i< str.length() - len +1; i++){
            if(str.substring(i, i+len).equals(word)){
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + len < str.length()) {
                    result.append(str.charAt(i + len));
                }
                i += len - 1;
            }
        }

        return result.toString();

    }


}
