package day_01;

public class While2 {
	public static void main(String[] args) {
		int[] intArray = new int[100];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
		int i = 0;
		int sum = 0;
		while (true) {
			i++;
			if (intArray[i-1] % 2 ==1) {
				continue;
			}
			sum += intArray[i-1];
			
			if(i == 100) {
				break;
			}
		}
		System.out.println(sum);
	}
}
