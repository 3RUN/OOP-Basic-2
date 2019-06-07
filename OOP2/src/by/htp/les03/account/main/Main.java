package by.htp.les03.account.main;

import java.util.*;

import by.htp.les03.account.entity.Account;
import by.htp.les03.account.entity.Customer;
import by.htp.les03.account.logic.BankLogic;

public class Main {

	public static void main(String[] args) {

		List<Account> accountList = new ArrayList<Account>();

		Account accountA = new Account(1, 10.0, false);
		accountList.add(accountA);
		Account accountB = new Account(4, 50.0, false);
		accountList.add(accountB);
		Account accountC = new Account(2, 0.0, false);
		accountList.add(accountC);
		Account accountD = new Account(5, -40.0, false);
		accountList.add(accountD);
		Account accountE = new Account(3, 5.0, true); // blocked
		accountList.add(accountE);

		Customer customer = new Customer("Kochkarov Magomet Robertovich", accountList);

		System.out.println("Customer " + customer.getFullName() + " has total of " + customer.getAccount().size()
				+ " accounts.\n");

		// sort them by balance
		BankLogic.sortByBalance(customer);

		// show them
		displayAccount(customer.getAccount());

		// show total cash
		System.out.println("Total cash " + BankLogic.getBalance(customer) + " rub.");
		// available money
		System.out.println("Available " + BankLogic.getBalanceAvailable(customer) + " rub.");
		// show debt
		System.out.println("Debt " + BankLogic.getDebt(customer) + " rub.");
		// show total balance
		System.out.println("Balance (debt repaid) " + BankLogic.getBalanceDeptRepaid(customer) + " rub.\n");

		// show accounts with balance more than 10 rub
		System.out.println("All accounts with balance more than 10 rub.");
		displayAccount(BankLogic.findByBalance(customer, 10.0));

		// show blocked accounts
		System.out.println("All blocked accounts:");
		displayAccount(BankLogic.findBlocked(customer));

		// show not blocked accounts
		System.out.println("All not blocked accounts:");
		displayAccount(BankLogic.findNotBlocked(customer));

		// show accounts with negative balance
		System.out.println("All accounts with negative balance:");
		displayAccount(BankLogic.findNegative(customer));

		// show accounts with positive balance
		System.out.println("All accounts with positive balance:");
		displayAccount(BankLogic.findPositive(customer));

	}

	public static void displayAccount(List<Account> account) {
		int i = 0;
		for (i = 0; i < account.size(); i++) {
			int id = account.get(i).getId();
			double balance = account.get(i).getBalance();
			boolean blocked = account.get(i).isBlocked();
			System.out.println("Account number " + id + " with balance " + balance + "rub. Blocked: " + blocked);

		}
		System.out.println();
	}

}
