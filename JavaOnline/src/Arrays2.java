
public class Arrays2 {

	public static void main(String[] args) {
		//
		String[] names = new String[3];
		
		names[0] ="Raphael";
		names[1] ="Goku";
		names[2] ="Titi";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Position " + (i+ 1) + " Value = " + names[i]);
		}

	}

}
