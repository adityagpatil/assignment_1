/*21. Implement Java program to check if a given number is Fibonacci number or not.*/

class Fibonacci_21{
	public static void main(String args[]){
		int num = 13;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		while(num3 <= num){
			if(num3 == num){
				System.out.println("Number is fibonacci");
				return;
			}
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;		
		}
		System.out.println("Number is not fibonacci");
	}
}