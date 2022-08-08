package Encapsulation;

public class GFGFG {

	public static void main(String[] args) {
//		creating instance for Account class
		
		Account acc = new Account();
//		setting values through setter methods
		acc.setAcc_no(5434543);
		acc.setName("HARI RAM");
		acc.setEmail("RAM@GMAIL.COM");
		acc.setAmount(1000000f);
		
//		geting the values through getter methods
		System.out.println(acc.getAcc_no() + 
				" " + acc.getNaame() + " "
				+ "  " +acc.getEmail() + " "
				+acc.getAmount()
				);
	}
}
