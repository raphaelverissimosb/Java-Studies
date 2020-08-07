
public class FlowControl5 {

	public static void main(String[] args) {
		// 
		
		double totalValue = 30000;
		
		for( int parcel = 1 ; parcel <= totalValue; parcel++) {
			double parcelValue = totalValue / parcel;
			if(parcelValue >= 1000) {
			System.out.println("P fee = " + parcel + " R$ " + parcelValue);
			}else {
				break;
			}
		}

	}

}
