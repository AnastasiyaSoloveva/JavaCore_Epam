package java_epam.CodingBat.Warmup1;


public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile)||(!aSmile && !bSmile)){
            return true;
        }
        return false;

    }

    public int sumDouble(int a, int b) {
        int s = a+b;
        if (a==b){
            s = s*2;
        }
        return s;
    }

    public int diff21(int n) {
        int diff = 21-n;
        if (n > 21){
            diff = 2*diff*-1;
        }
        return diff;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        int sum = a+b;
        if(sum==10 || a==10 || b==10){
            return true;
        }
        return false;

    }

    public boolean nearHundred(int n) {
        int diff100 = Math.abs(100-n);
        int diff200 = Math.abs(200-n);
        if (diff100 <= 10 || diff200 <= 10){
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a < 0 && b < 0);

        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }

    }

    public String notString(String str) {
        String result = "not" + " " + str;
        if (str.length() >= 3 && str.substring(0,3).equals("not")){
            result = str;
        }
        return result;

    }

    public String missingChar(String str, int n) {
        String result = "";
        if (n == 0 ) {
            result = str.substring(n+1);
        } else{
            result = str.substring(0,n) + str.substring(n+1, str.length());

        }
        return result;
    }


    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }

    public String front3(String str) {
        if (str.length() <=3) return str+str+str;
        String front = str.substring(0,3);
        return front+front+front;

    }

    public String backAround(String str) {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);

    }

    public boolean or35(int n) {
        return (n%3 == 0 || n % 5 == 0);
    }

    public String front22(String str) {
        if (str.length() <= 2) return str + str + str;
        String two = str.substring(0,2);
        return two + str + two;
    }

    public boolean startHi(String str) {
        if (str.length() >=2){
            return (str.substring(0,2).equals("hi"));
        }

        return false;

    }


    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) ||(temp1 > 0 && temp2 < 100));
    }


    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19));
    }

    public boolean loneTeen(int a, int b) {
        boolean ateen = (a >=13 && a <=19);
        boolean bteen = (b >=13 && b <=19);

        return (ateen && !bteen) || (!ateen && bteen);
        // Translation: one or the other, but not both.


    }

     // delete "del"
    public String delDel(String str) {
        if (str.indexOf("del",1) == 1){
            return str.charAt(0) + str.substring(4);

        }else{
            return str;
        }

    }

    public boolean mixStart(String str) {
        if(str.length() < 3) {
            return false;
        }
        if (str.indexOf("ix",1) == 1) {
            return true;
        }
        return false;

    }


    public String startOz(String str) {
        String res = "";
        if (str.length() >= 1 && str.charAt(0) =='o'){
            res = res + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) =='z'){
            res = res + str.charAt(1);
        }
        return res;
    }

    // find max
    public int intMax(int a, int b, int c) {
        int max = Math.max(a,b);
        if (c > max) {
            max = c;
        }
        return max;
    }

    public int close10(int a, int b) {
        int a10 = Math.abs(10-a);
        int b10 = Math.abs(10-b);
        if (a10 == b10) return 0;
        if (a10 < b10) {
            return a;
        }else {
            return b;
        }


    }

}
