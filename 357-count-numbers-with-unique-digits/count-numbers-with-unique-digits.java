class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        if(n==2) {
            return 9*9+countNumbersWithUniqueDigits(1);
        }
         if(n==3) {
            return 9*9*8+countNumbersWithUniqueDigits(2);
        }
         if(n==4) {
            return 9*9*8*7+countNumbersWithUniqueDigits(3);
        } if(n==5) {
            return 9*9*8*7*6+countNumbersWithUniqueDigits(4);
        } if(n==6) {
            return 9*9*8*7*6*5+countNumbersWithUniqueDigits(5);
        } if(n==7) {
            return 9*9*8*7*6*5*4+countNumbersWithUniqueDigits(6);
        } if(n==8) {
            return 9*9*8*7*6*5*4*3+countNumbersWithUniqueDigits(7);
        }
        else{
            return 0;
        }
    }
}