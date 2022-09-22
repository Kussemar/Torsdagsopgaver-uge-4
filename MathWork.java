import java.util.Random;

class MathWork{
	public static void main (String[] args){
		int numbers = 100;
		int divisible = 12;
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

		for (int i = 1; i <= numbers; i++){
			if(i%divisible==0){
				System.out.print(i + " ");
			}
	

		}
		System.out.println();
		System.out.println(getRandom(arr)); //Her "kalder" vi metoden.

		printNum(5);
	}
	public static int getRandom(int[]arr){
		int rnd = new Random().nextInt(arr.length);
		return arr[rnd];
	}

	public static void printNum(int num){
	System.out.println(num);
	num = num -1;
	System.out.println(num);
}
}	