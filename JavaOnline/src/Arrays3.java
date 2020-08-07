
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1 = new int[4];
		int[] numbers2 = {10,20,30,40};// the size is 4 ...but the index is  3
		
		// or 
		
		int[] numbers3 = new int[] {1,2,3,4,5};
		
		for(int i = 0;i < numbers2.length ; i++) {
			System.out.println("Position" + (i + 1) + "Value =" + numbers2[i]);
		}
		
		System.out.println();
		
		for(int numbAux : numbers3) {
			System.out.println(numbAux);
		}
		
		int i = 0;
		while(i < numbers1.length) {
			System.out.println(numbers1[i]);
			i++;
		}
		
	}

}
