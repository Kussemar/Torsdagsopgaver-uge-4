class Pow{
	 public static void main(String args[]){  
	String testSubString = "København";
        System.out.println(testSubString.substring(1, 5) );

        printPartOfWord("København", 1, 5);
	}
	public static String printPartOfWord(String s, int index, int endIndex){
		return s.substring(index, endIndex);
	}
}