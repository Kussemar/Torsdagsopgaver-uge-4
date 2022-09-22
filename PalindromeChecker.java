public class PalindromeChecker {  
public static boolean isPalindrome(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    String rev=sb.toString();  
    if(str.equals(rev)){  
        return true;  
    }else{  
        return false;  
    }  
}  
}  