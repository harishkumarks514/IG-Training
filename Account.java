package Encapsulation;

public class Account {

//	private data members to hide data
	private long acc_no;
	private String name,email;
	private float amount;
	private float amuont;
	
//	public getter and setter methods
	
	public long getAcc_no()
	{
		return acc_no;
	}
	
	public void setAcc_no(long acc_no)
	{
		this.acc_no = acc_no;
	}
	public String getNaame()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
	public void setAmount(float amount)
	{
		this.amuont = amount;
	}
}

 























