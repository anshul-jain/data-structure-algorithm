package com.artihcsolu.dsa.leet.ea.other;

public class PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        } else{
            int temp = x;
            int rev = 0;
            while(x!=0){
                int rem = x%10;
                rev = rev*10 + rem;
                x = x/10;
            }
            return temp == rev;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(-11));
    }
}
