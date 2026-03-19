package InterfacePractice;

public class Bank implements Measurable {
	private double balance;
	private String name;
	private static int size;

	public Bank(String name,double balance) {
		this.name=name;
		this.balance=balance;
		size++;
	}
	public Bank() {
		this("non",000);
		size++;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	@Override
	public double getMeasure() {
		return getBalance();
	}
	@Override
	public int getSize() {
		
		return size;
	}
	
	public String toString() {
		String s ;
		s=("The Name Of The Bank Accuount " +this.getName()+" The Balance is "+this.getBalance());
		return s;
	}
	
	

}
