package week3.day1;

public class ConcreateClassAmazon extends AbstracClassCanaraBank {


	@Override
	
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Cash delviery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("cardPayments");
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet banking");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreateClassAmazon amazonobj  = new ConcreateClassAmazon();
		amazonobj.cashOnDelivery();
		amazonobj.cardPayments();
		amazonobj.upiPayments();
		amazonobj.internetBanking();
		amazonobj.recordPaymentDetails();
		
	}
	
  //output:
	//Cash delviery
	//cardPayments
	//UPI Payments
	//Internet banking
	//Record payment From abstract class

}
