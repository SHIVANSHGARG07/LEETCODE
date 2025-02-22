class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Find the GCD of the lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The common divisor string is the prefix of str1 up to gcdLength
        return str1.substring(0, gcdLength);
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    
    }
