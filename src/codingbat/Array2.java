package codingbat;


import java.util.Arrays;

public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;

    }


    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }

        }

        return max - min;

    }


    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }

        return sum / (nums.length - 2);

    }

    public int sum13(int[] nums) {
        int sum = 0;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;

    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }


    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return sum == 8;

    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 4) {
                count4++;
            }

        }

        return count1 > count4;

    }


    public int[] fizzArray(int n) {
        int[] newArray = new int[n];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }


    public String[] fizzArray2(int n) {
        String[] stringArray = new String[n];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(i);
        }

        return stringArray;
    }

    public boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            }

            if (nums[i] == 4) {
                count4++;
            }
        }
        return count1 != 0 && count4 != 0 ? false : true;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }

        return true;
    }

    public boolean either24(int[] nums) {
        boolean has2 = false;
        boolean has4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                has4 = true;
            }
        }

        return has2 ^ has4;

    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }

        }
        return count;

    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                } else if (i + 2 < nums.length && nums[i + 2] == 7) {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean has1 = false;
        boolean has2 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                has1 = true;
            }

            if (has1 && nums[i] == 2) {
                has2 = true;
            }
        }

        return has1 && has2;
    }

    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) ||
                    (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1)) {
                return true;
            }


        }

        return false;
    }

    public boolean haveThree(int[] nums) {
        int count3 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 3) {
                count3++;
            }
        }

        if (nums.length > 0 && nums[nums.length - 1] == 3) {
            count3++;
        }

        return count3 == 3;
    }


    public boolean twoTwo(int[] nums) {
        boolean twoTwo = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                twoTwo = i >= 1 && nums[i - 1] == nums[i] ? true : false;

            }

        }

        return twoTwo;

    }

    public boolean sameEnds(int[] nums, int len) {
        int start = 0;
        int end = nums.length - len;

        for (int i = 0; i < len; i++) {
            if (nums[start++] != nums[end++]) {
                return false;
            }
        }
        return true;

    }


    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 2] == nums[i + 1] + 1 && nums[i + 1] == nums[i] + 1) {

                return true;

            }
        }
        return false;
    }


    public int[] fizzArray3(int start, int end) {
        int len = end - start;
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = start + i;
        }

        return arr;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length >= 2) {
            int tmp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }

            nums[nums.length - 1] = tmp;
        }

        return nums;
    }

    public int[] tenRun(int[] nums) {
        int mult10 = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                mult10 = nums[i];
                flag = true;
            }
            if (flag) {
                nums[i] = mult10;

            }
        }

        return nums;

    }

    public int[] pre4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }

        int[] newArr = Arrays.copyOfRange(nums, 0, index);

        return newArr;

    }

    public int[] post4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index = i;

            }
        }

        int[] newArr = Arrays.copyOfRange(nums, index + 1, nums.length);

        return newArr;

    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                if (nums[i + 1] > nums[i - 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return nums;

    }

    public int[] zeroFront(int[] nums) {
        int tmp = 0;
        int count0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else {
                tmp = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < count0) {
                nums[i] = 0;
            } else {
                nums[i] = tmp;
            }

        }

        return nums;

    }


    public int[] withoutTen(int[] nums) {
        int[] array = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                array[j] = nums[i];
                j++;
            }
        }

        return array;

    }

    public int[] zeroMax(int[] nums) {

        int maxOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && nums[i] > maxOdd) {
                maxOdd = nums[i];
            }

            if (nums[i] == 0) {
                nums[i] = maxOdd;
            }
        }

        return nums;
    }

    public int[] evenOdd(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[start] = nums[i];
                start++;
            }
            if (nums[i] % 2 == 1) {
                array[end] = nums[i];
                end--;
            }
        }

        return array;

    }

    public String[] fizzBuzz(int start, int end) {

        String[] stringArr = new String[end - start];
        for (int i = 0; i < stringArr.length; i++) {
            if (start % 3 == 0 && start % 5 == 0) {
                stringArr[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                stringArr[i] = "Fizz";
            } else if (start % 5 == 0) {
                stringArr[i] = "Buzz";
            } else {
                stringArr[i] = String.valueOf(start);

            }
            start++;


        }

        return stringArr;


    }


}
