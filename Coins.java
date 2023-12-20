class Coins {
	public static void main (String [] args){
		int WholeAmountInCents = Integer.parseInt(args[0]);
		int Quarters = WholeAmountInCents / 25;
		int Cents = WholeAmountInCents % 25;
		System.out.println("Use " + Quarters + " quarters " + "and " + Cents + " cents");



	}




}