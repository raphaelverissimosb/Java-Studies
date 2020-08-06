
public class AtributionOperators {

	public static void main(String[] args) {
		// =, -=, +=, *=, /=, %= 
		
		float salary = 1800f;
		salary += 1000;
		System.out.println(salary);
		System.out.println();
		salary = salary + (float)(salary * 0.1);
		System.out.println(salary);
		
	}

}
