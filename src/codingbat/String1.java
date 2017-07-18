package codingbat;


public class String1 {


    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;

    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String s = str.substring(str.length() - 2, str.length());
        return s + s + s;
    }

    public String firstTwo(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() <= 2) {
            return str;
        }

        return str.substring(0, 2);

    }

    public String firstHalf(String str) {
        int len = str.length() / 2;
        return str.substring(0, len);

    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);

    }

    public String comboString(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if (aLen > bLen) {
            return b + a + b;
        } else {
            return a + b + a;
        }

    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);

    }

    public String right2(String str) {
        String result;

        String last = str.substring(str.length() - 2, str.length());
        result = last + str.substring(0, str.length() - 2);

        return result;
    }


    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);

        } else {
            return str.substring(str.length() - 1, str.length());
        }

    }

    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, (str.length() / 2 + 1));
    }


    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        String end = str.substring(str.length() - 2, str.length());
        if (end.equals("ly")) {
            return true;
        }
        return false;

    }

    public String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n, str.length());
        return first + last;


    }

    public String twoChar(String str, int index) {
        if (index > str.length() - 2 || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        String bad = "bad";
        int i = str.indexOf(bad);
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        }
        if (str.length() == 1) {
            return str + "@";
        }
        return str.substring(0, 2);

    }

    public String lastChars(String a, String b) {
        String s = "";
        if (a.length() == 0) {
            s += "@";
        } else {
            s += a.charAt(0);
        }
        if (b.length() == 0) {
            s += "@";
        } else {
            s += b.charAt(b.length() - 1);
        }
        return s;

    }

    public String conCat(String a, String b) {
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a.substring(0, a.length()) + b.substring(1, b.length());
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char prev = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);

        return str.substring(0, str.length() - 2) + last + prev;

    }

    public String seeColor(String str) {
        if (str.indexOf("red") == 0) {
            return "red";
        }
        if (str.indexOf("blue") == 0) {
            return "blue";
        }
        return "";

    }

    public boolean frontAgain(String str) {
        if (str.length() <= 1) {
            return false;
        }
        String first = str.substring(0, 2);
        String last = str.substring(str.length() - 2, str.length());

        if (first.equals(last)) {
            return true;
        }
        return false;

    }

    public String minCat(String a, String b) {
        String result = "";
        int min = Math.min(a.length(), b.length());
        if (a.length() != 0) {
            result += a.substring(a.length() - min, a.length());
        }
        if (b.length() != 0) {
            result += b.substring(b.length() - min, b.length());
        }
        return result;

    }

    public String extraFront(String str) {
        if (str.length() >= 2) {
            String first2 = str.substring(0, 2);
            return first2 + first2 + first2;
        }
        return str + str + str;

    }

    public String without2(String str) {
        String res = "";
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            if (str.length() > 2) {
                res += str.substring(2, str.length());
            }
        } else {
            res += str;
        }
        return res;
    }

    public String deFront(String str) {
        String result = "";
        if (str.length() >= 2) {
            if (str.charAt(0) == 'a') {
                result += str.charAt(0);
            }
            if (str.charAt(1) == 'b') {
                result += str.charAt(1);
            }
        }
        if (str.length() > 2) {
            result += str.substring(2, str.length());
        }

        return result;

    }

    public String startWord(String str, String word) {
        String result = "";
        if (word.length() == 1) {
            if (str.length() >= 1) {
                result += str.charAt(0);
            }
        } else {
            if (str.length() >= word.length()) {
                if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
                    result += str.substring(0, word.length());
                }
            }
        }
        return result;
    }


    public String withoutX(String str) {
        String result = str;
        if (str.length() > 0 && str.charAt(0) == 'x') {
            result = str.substring(1, str.length());
        }
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            result = result.substring(0, result.length() - 1);
        }

        return result;

    }

    public String withoutX2(String str) {
        if (str.length() < 2) {
            return "";
        }
        String result = str.substring(2);
        if (str.charAt(1) != 'x') {
            result = str.charAt(1) + result;
        }

        if (str.charAt(0) != 'x') {
            result = str.charAt(0) + result;
        }
        return result;

    }

}
