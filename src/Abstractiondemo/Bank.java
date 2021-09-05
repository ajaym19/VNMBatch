package Abstractiondemo;

public class Bank implements ATBGoverningBody{

	
	public void depositMoney() {
		System.out.println("Depositing Money");
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Withdrawing Money");
		
	}

	
	
}
