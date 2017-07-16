package codingbat;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length < 1)
            return false;
        return nums[0] == nums[nums.length - 1];


    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];

    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;

        return nums;
    }


    public int[] reverse3(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }


    public int[] maxEnd3(int[] nums) {
        int max = 0;
        if (nums[0] > nums[nums.length - 1]) {
            max = nums[0];

        } else {
            max = nums[nums.length - 1];

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
        return nums;

    }


    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            sum += nums[0];
        }

        if (nums.length >= 2) {
            sum = nums[0] + nums[1];
        }

        return sum;
    }


    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }


    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        boolean isContain = false;
        for (int i = 0; i < 2; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                isContain = true;
            }
        }

        return isContain;

    }

    public boolean no23(int[] nums) {
        boolean isContain = true;
        for (int i = 0; i < 2; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                isContain = false;
            }
        }

        return isContain;

    }

    public int[] makeLast(int[] nums) {
        int len = nums.length * 2;
        int[] array = new int[len];
        array[array.length - 1] = nums[nums.length - 1];
        return array;
    }

    public boolean double23(int[] nums) {
        if (nums.length == 2) {
            if (nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3))
                return true;

        }
        return false;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;

    }

    public int start1(int[] a, int[] b) {
        int res = 0;
        if (a.length > 0) {
            if (a[0] == 1) {
                res++;
            }
        }
        if (b.length > 0) {
            if (b[0] == 1) {
                res++;
            }
        }
        return res;

    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA == sumB) {
            return a;
        }

        return sumA > sumB ? a : b;
    }

    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;

    }

    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};

    }

    public int maxTriple(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length / 2];
        int c = nums[nums.length - 1];
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;

    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};

    }

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
            return true;
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length >= 2) {
            return new int[]{a[0], a[1]};
        } else if (a.length == 0) {
            return new int[]{b[0], b[1]};
        } else {
            return new int[]{a[0], b[0]};

        }

    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[]{};
        }
        if (a.length == 0) {
            return new int[]{b[0]};
        }
        if (b.length == 0) {
            return new int[]{a[0]};
        }

        return new int[]{a[0], b[0]};

    }


}
