package br.com.devdojo.introduction.flowcontrol;

public class flowControl6 {
	public static void main(String[] args) {
		
		double totalValue = 30000;
		
		for(int parcel = (int)totalValue ; parcel >= 1; parcel--) {
			
			double parcelValue = totalValue / parcel;
			if(parcelValue <= 1000) {
				continue;
			}
			System.out.println("P fee = " + parcel + " R$ " + parcelValue);
		}
		
	}
}
