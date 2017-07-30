package codingbat;


public class WarmUp2 {

    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += str;
        }
        return s;
    }

    public String frontTimes(String str, int n) {
        String s = "";
        if (str.length() <= 3) {
            for (int i = 0; i < n; i++) {
                s += str;
            }
        } else {
            for (int i = 0; i < n; i++) {
                s += str.substring(0, 3);
            }
        }
        return s;

    }

    int countXX(String str) {
        int count = 0;
        String x2 = "xx";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(x2)) {
                count++;
            }
        }

        return count;
    }

    boolean doubleX(String str) {
        char[] ch = str.toCharArray();
        int i = str.indexOf("x");
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == 'x' && j == i + 1) {
                return true;
            }


        }
        return false;

    }

    public String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 2) {
            res = res + str.substring(i, i + 1);
        }
        return res;


    }

    public String stringSplosion(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            res = res + str.substring(0, i + 1);
        }
        return res;
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        String last = str.substring(str.length() - 2, str.length());
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String st = str.substring(i, i + 2);
            if (st.equals(last)) {
                count++;
            }
        }
        return count;

    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        if (nums.length <= 4) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;

    }

    public int stringMatch(String a, String b) {
        int length = a.length() < b.length() ? a.length() : b.length();
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            String a1 = a.substring(i, i + 2);
            String b1 = b.substring(i, i + 2);
            if (a1.equals(b1)) {
                count++;
            }
        }

        return count;
    }

    public String stringX(String str) {
        String res = "";
        if (str.length() < 2) return str;

        if (str.startsWith("x") && str.endsWith("x")) {
            res += str.charAt(0);
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) != 'x') {
                    res += str.charAt(i);
                }
            }
            res += str.charAt(str.length() - 1);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 'x') {
                    res += str.charAt(i);
                }

            }
        }

        return res;

    }

    public boolean has271(int[] nums) {
        for (int i =0; i< nums.length -2; i++ ){
            int value = nums[i];
            if (nums[i+1] == (value + 5) && Math.abs(nums[i+2] - (value-1)) <=2){
                return true;
            }
        }
        return false;
    }



    public String altPairs(String str) {
        String s = "";
        for (int i = 0; i <str.length(); i = i+4){
            if(i+2 < str.length()) {
                s = s + str.substring (i,i+2);
            }else{
                s = s + str.substring (i,str.length());
            }
        }
        return s;
    }


    public String stringYak(String str) {

        StringBuilder result = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                i+=2;
            } else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();

    }


    public int array667(int[] nums) {
        int count = 0;
        for(int i =0; i < nums.length-1; i++){
            if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7 )){
                count++;
            }
        }

        return count;

    }

    public boolean noTriples(int[] nums) {
        for(int i = 0; i < nums.length -2; i++){
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                return false;
            }
        }
        return true;

    }





}
