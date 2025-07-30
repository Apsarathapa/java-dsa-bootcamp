public class PalindromeString {
    public static void main(String[] args){
        String word = "racecar";
        if(isPalindrome(word)){
        System.out.println("The given word is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
    //checking palindrome using two pointers
    public static boolean isPalindrome(String str){
        int left = 0; //left pointer
        int right = str.length()-1; //right pointer
        while(left < right){
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);
            if(leftChar != rightChar){ //if characters dont match on both ends, then its nit palindrome
                System.out.println("Characters dont match, so the string is not palindrome");
                return false;
            }
            left++; //move left pointer 
            right--; //move right pointer 
        }
        System.out.println("Characters matched , String is palindrome");
        return true;
    }
}

