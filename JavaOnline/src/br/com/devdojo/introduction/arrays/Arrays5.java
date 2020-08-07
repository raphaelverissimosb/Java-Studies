package br.com.devdojo.introduction.arrays;

public class Arrays5 {

	public static void main(String[] args) {
		// Arrays
		int [][] days = new int[2][2];
		
		days[0][0] = 10;
		days[0][1] = 20;
		
		days[1][0] = 11;
		days[1][1] = 12;

		for(int i = 0 ; i < days.length; i++) {
			for(int j = 0 ; j < days[i].length;j ++) {
				System.out.println(days[i][j]);
			}
		}
		
		System.out.println();
		//using for each to print our result on the screen 
		
		for(int[] ref : days) {
			for(int day : ref) {
				System.out.println(day);
			}
		}
		
		
	}

}
