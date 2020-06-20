package day_01;

public class While {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=i+1;
		}
		boolean whileStatus = true;
		int i = 0;
		int sum =0;
		while (whileStatus) {
//			if(intArray[i]>50) {
//				whileStatus = false;
//			}else {
//				sum += intArray[i]
//			}
			if(intArray[i]>50)break;
			sum += intArray[i];
			i++;
			
			
		}
		System.out.println(sum);
	}
}
