class PalindromeCheck {

public static String isPalindrom(String word) {

     String reverseStr = "";
    
    int wordLength = word.length();

    for (int i = (wordLength - 1); i >=0; --i) {
      reverseStr = reverseStr + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
     // System.out.println(word + " is a Palindrome String.");
      return word + " is a Palindrome String.";
    }
    else {
     // System.out.println(word + " is not a Palindrome String.");
      return word + " is not a Palindrome String.";
    }
  }

//Man kan evt lave en ny tab og putte det her i, og kalde det fra "main".
  public static void main(String[] args) {
 String text = isPalindrom("Tacocats");
 System.out.println(text);
  }
}
