/*import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

  
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

       
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}*/
class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;

        int original = x;   
        long reversed = 0;  
       
        while (x > 0) {
            int digit = x % 10;          
            reversed = reversed * 10 + digit; 
            x /= 10;               
        }

        
        return original == reversed;
    }
}

