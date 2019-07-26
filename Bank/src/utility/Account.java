package utility;

public class Account {

	private int account;
	private String name;
	private double total;
	
	public Account(int account, String name, double total ) {
		this.account = account;
		this.name = name;
		this.total = total;
	}
	
	public Account(int account, String name) {
		this.account = account;
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void deposit(double value) {
		total += value;
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println("Account " + account + ", Holder" + name + ", Balance: $ " +  total);
		
	}
	
	public void withdraw(double value) {
		total = total - (value + 5);
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println("Account " + account + ", Holder" + name + ", Balance: $ " +  total);
	}
	
	
	public void showData() {
		System.out.println("Account " + account + ", Holder" + name + ", Balance: $ " +  total);
	}
}
