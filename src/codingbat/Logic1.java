package codingbat;


public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }

    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (temp >= 60 && temp <= 100) {
                return true;
            }

        } else {
            if (temp >= 60 && temp <= 90) {
                return true;
            }

        }
        return false;

    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed < 65) {
                return 0;
            }
            if (speed >= 66 && speed <= 85) {
                return 1;
            }
            if (speed > 86) {
                return 2;
            }

        } else {
            if (speed < 60) {
                return 0;
            }
            if (speed >= 61 && speed <= 80) {
                return 1;
            }
            if (speed > 81) {
                return 2;
            }
        }
        return 0;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day != 0 && day != 6) {
                return "10:00";
            }
            return "off";

        } else {
            if (day != 0 && day != 6) {
                return "7:00";
            }
            return "10:00";

        }
    }

    public boolean love6(int a, int b) {
        int sum = a + b;
        int dif = Math.abs(a - b);
        return a == 6 || b == 6 || sum == 6 || dif == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;

        } else {
            return n >= 1 && n <= 10;

        }

    }

    public boolean specialEleven(int n) {
        int a = n % 11;
        return a == 0 || a == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;

    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) return false;
        return n % 3 == 0 || n % 5 == 0;

    }

    public boolean less20(int n) {
        int mult = n % 20;
        return mult == 18 || mult == 19;

    }

    public boolean nearTen(int num) {
        int mult = num % 10;
        return mult >= 8 || mult <= 2;
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19;
        else return a + b;

    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMom) return false;


        return true;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }

        return 1;

    }

    public String fizzString(String str) {
        if (str.charAt(str.length() - 1) == 'b' && str.charAt(0) == 'f') return "FizzBuzz";
        if (str.charAt(0) == 'f') return "Fizz";
        if (str.charAt(str.length() - 1) == 'b') return "Buzz";

        return str;

    }

    public String fizzString2(int n) {
        String result = Integer.toString(n);
        if (n % 3 == 0) {
            result = "Fizz";
        }
        if (n % 5 == 0) {
            result = "Buzz";
        }

        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        }
        return result + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || c + b == a);

    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (c > b) {
                return true;
            }

        } else {
            if (b > a && c > b) {
                return true;
            }

        }
        return false;
    }


    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a < b && b < c) {
            return true;
        }
        if (equalOk) {
            if (a <= b && b <= c) {
                return true;
            }

        }


        return false;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (noDoubles) {
            if (die1 == die2) {
                if (die1 == 6) {
                    return 7;
                }
                return sum + 1;
            }
        }


        return sum;
    }

    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return a > b ? b : a;
        return a > b ? a : b;

    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 & b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;

        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;

    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || a == c || b == c) {
            return 10;
        }
        return 0;
    }


    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || ac == 10 || bc == 10) {
            return 10;
        }
        if (ab == 10 + bc || ab == 10 + ac) {
            return 5;
        }

        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10);
    }

    public int sumLimit(int a, int b) {
        String a1 = String.valueOf(a);
        int sum = a + b;
        String sum1 = String.valueOf(sum);
        if (sum1.length() == a1.length()) {
            return sum;
        }

        return a;
    }


}
