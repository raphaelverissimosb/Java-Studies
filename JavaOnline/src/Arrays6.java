
public class Arrays6 {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[4];
		int[] arr3 = new int[] {1,2,3,4};
		
		
//		days[0] = new int[2];
//		days[1] = new int[] {1,2,3};
//		days[2] = new int[4];
		

        int[][] days = {{0,0},{1,2,3},{0,0,0,0}};		
		
		for(int[] arr : days) {
			for(int num : arr){
				System.out.println(num);
			}
				
		}
		
		
		
	}
}
