package practice;

public class WarNumbers {
	// There's a great war between the even and odd numbers. Many numbers already
	// lost their lives in this war and it's your task to end this. You have to
	// determine which group sums larger: the evens, or the odds. The larger group
	// wins.

//Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.

	public static void main(String[] args) {
		//Declaro el array con 4 numeros, para dividirlo en pares y sumarlos por separado
		//2 + 2 --> 4
		//5 + 4 --> 9
		int[] intArray = { 2, 2, 5, 4 };

		System.out.println(warOfNumbers(intArray));
	}

	//Metodo que lleva el array a trabajar por parametro, para realizar la suma en pares mencionada
	public static int warOfNumbers(int[] numbers) {
		int indexElement = 0; 
		int sumNum = 0;
		boolean passedTwo = false;
		
		System.out.print("{ ");
		for (int j = 0; j < numbers.length; j++) {
			System.out.print(numbers[j] + ", ");
		}
		System.out.print("}");
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			if (passedTwo == false) {
				if (i >= 2) {
					System.out.println("{ "+ numbers[0] + ", " + numbers[1] + " } --> " + sumNum);
					sumNum = 0;
				}
			}
			indexElement = numbers[i];
			sumNum += indexElement;
			if (i >= 2) {
				passedTwo = true;
			}
			System.out.println();

		}
		System.out.print("{ " + numbers[2] + ", " + numbers[3] + " } --> ");
		return sumNum;
	}

}
