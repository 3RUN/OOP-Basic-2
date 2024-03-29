package by.htp.les03.account.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.les03.account.entity.Account;
import by.htp.les03.account.entity.Customer;
import by.htp.les03.account.logic.BankLogic;

public class Main {

	public static void main(String[] args) {

		Account[] accountInit = new Account[5];
		accountInit[0] = new Account(1, 10.0, false);
		accountInit[1] = new Account(4, 50.0, false);
		accountInit[2] = new Account(2, 0.0, false);
		accountInit[3] = new Account(5, -40.0, false);
		accountInit[4] = new Account(3, 5.0, true); // blocked

		int i = 0;
		List<Account> accountList = new ArrayList<Account>();
		for (i = 0; i < accountInit.length; i++) {
			accountList.add(accountInit[i]);
		}

		Customer customer = new Customer("Magomet", "Kochkarov", accountList);

		System.out.println("Customer " + customer.getName() + " " + customer.getSurname() + " has total of "
				+ customer.getAccount().size() + " accounts.\n");

		// sort them by balance
		BankLogic logic = new BankLogic();

		logic.sortByBalance(customer);

		// show them
		displayAccount(customer.getAccount());

		// show total cash
		System.out.println("Total cash " + logic.getBalance(customer) + " rub.");
		// available money
		System.out.println("Available " + logic.getBalanceAvailable(customer) + " rub.");
		// show debt
		System.out.println("Debt " + logic.getDebt(customer) + " rub.");
		// show total balance
		System.out.println("Balance (debt repaid) " + logic.getBalanceDeptRepaid(customer) + " rub.\n");

		// show accounts with balance more than 10 rub
		System.out.println("All accounts with balance more than 10 rub.");
		displayAccount(logic.findByBalance(customer, 10.0));

		// show blocked accounts
		System.out.println("All blocked accounts:");
		displayAccount(logic.findBlocked(customer));

		// show not blocked accounts
		System.out.println("All not blocked accounts:");
		displayAccount(logic.findNotBlocked(customer));

		// show accounts with negative balance
		System.out.println("All accounts with negative balance:");
		displayAccount(logic.findNegative(customer));

		// show accounts with positive balance
		System.out.println("All accounts with positive balance:");
		displayAccount(logic.findPositive(customer));

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
