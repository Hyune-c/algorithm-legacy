package leetcode.romantointeger;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int subSum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'V':
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        subSum += 4;
                        i--;
                    } else {
                        subSum += 5;
                    }
                    break;
                case 'X':
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        subSum += 9;
                        i--;
                    } else {
                        subSum += 10;
                    }
                    break;
                case 'I':
                    subSum += 1;
                    break;
                case 'L':
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        subSum += 40;
                        i--;
                    } else {
                        subSum += 50;
                    }
                    break;
                case 'C':
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        subSum += 90;
                        i--;
                    } else {
                        subSum += 100;
                    }
                    break;
                case 'D':
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        subSum += 400;
                        i--;
                    } else {
                        subSum += 500;
                    }
                    break;
                case 'M':
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        subSum += 900;
                        i--;
                    } else {
                        subSum += 1000;
                    }
                    break;
                default:
                    sum += subSum;
                    subSum = 0;
            }
        }

        sum += subSum;

        return sum;
    }
}