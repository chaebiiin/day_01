package day_01;

public class For {
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		int[] intArray = new int[100];
		sum = 0;
		for (int i = 0; i < intArray.length; i++) { // 인덱스값에 1씩 증가하면서 값 넣기	
			intArray[i] = i+1;
		}
		for (int i = 0; i < intArray.length; i++) { // 인덱스에 있는 값들을 sum에 더한다.
			sum+=intArray[i];		
		}
		System.out.println(sum);
	}
}
