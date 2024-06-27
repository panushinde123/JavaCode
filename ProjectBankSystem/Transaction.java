package ProjectBankSystem;

public class Transaction {
	String operation;
	double amount1;
	public Transaction(String operation, double amount1) {
		super();
		this.operation = operation;
		this.amount1 = amount1;
	}
	@Override
	public String toString() {
		return "Transaction [operation=" + operation + ", amount=" + amount1 + "]";
	}
	
	
	
	
	

}

