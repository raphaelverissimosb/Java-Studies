
public class FlowControl3 {
	public static void main(String[] args) {
		byte day = 2;
		switch(day) {
			//  char , int, byte, short enum and String
		case 2:
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("There is not this day!");
			break;
		}
			
	}
}
