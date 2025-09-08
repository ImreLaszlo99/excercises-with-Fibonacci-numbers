package While_loop;

public class Fibonacci_with_while_loop {
	
	public static void main(String[] args) {
		int [] fiboNumbers = new int[10];
		fiboNumbers[0] = 1;
		fiboNumbers[1] = 1;
		int i = 2;
		while (i < 10) {
			fiboNumbers[i] = fiboNumbers[i - 1] + fiboNumbers[i - 2];
			i = i + 1;
		}
		
		System.out.println(java.util.Arrays.toString(fiboNumbers));
		
//      This is the same method, just in different way as the FOR cycle. 
//		for (int i = 2; i < 10; i++) {
//			fiboNumbers[i] =fiboNumbers[i - 1] + fiboNumbers[i - 2];
			
			
//		}
//		System.out.println(java.util.Arrays.toString(fiboNumbers));
		
	
	}
	

}
