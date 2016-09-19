package prob2;

public class Account {
	private String 	accountNo;
	private int balance=0;
	
	Account(String a)
	{
		System.out.println(a+"계좌가 개설되었습니다");
		this.accountNo=a;
	}
	
	public int getDeposit()
	{
		return this.balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int save(int a)
	{
		balance=balance+a;
		System.out.println(this.accountNo+"계좌에 "+a+"만원이 입금되었습니다");
		return balance;
	}
	public int deposit(int a)
	{
		balance=balance-a;
		System.out.println(this.accountNo+"계좌에 "+a+"만원이 출금되었습니다");
		return balance;
	}
	

}
