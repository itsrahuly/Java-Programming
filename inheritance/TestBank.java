class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount() {
		super();
	}

	BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
	

    String getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getAccountHolder() {
		return accountHolder;
	}

	void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    int withdrawalLimit;
    
    SavingsAccount() {
		super();
	}

	SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate, int withdrawalLimit) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
        this.withdrawalLimit = withdrawalLimit;
    }

    double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	int getWithdrawalLimit() {
		return withdrawalLimit;
	}

	void setWithdrawalLimit(int withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}

	void display() {
        super.display(); // show BankAccount details
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Withdrawal Limit: " + withdrawalLimit + " per month");
    }
}

class TestBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("BA1001", "Rahul", 50000);
        b1.display();

        System.out.println("-------------------");

        SavingsAccount s1 = new SavingsAccount("SA2001", "Venkat", 75000, 4.5, 5);
        s1.display();
    }
}
