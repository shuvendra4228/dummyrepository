package shuvendra;

public class FirstClass implements Rbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fc = new FirstClass();
		fc.withdrawl();
		fc.deposit();
		Rbi i = new FirstClass();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("Hi Withdrawl....");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Hi Deposit.......");
		
	}

}
