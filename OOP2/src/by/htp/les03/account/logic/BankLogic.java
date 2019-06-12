package by.htp.les03.account.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les03.account.entity.Account;
import by.htp.les03.account.entity.Customer;

public class BankLogic {

	public BankLogic() {
	}

	public List<Account> findById(Customer customer, int id) {
		int i = 0;
		List<Account> tempList = new ArrayList<Account>();
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			// get account's id
			// to compare it with the given one
			int tempId = account.get(i).getId();
			if (tempId == id) {
				// found one?
				// then add it to temporary list
				tempList.add(account.get(i));
			}

		}

		return tempList;
	}

	public List<Account> findByBalance(Customer customer, double balance) {
		int i = 0;
		List<Account> tempList = new ArrayList<Account>();
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			// get account's balance
			// to compare it with the given one
			double tempBalance = account.get(i).getBalance();
			if (tempBalance >= balance) {
				// found one?
				// then add it to temporary list
				tempList.add(account.get(i));
			}

		}

		return tempList;
	}

	public List<Account> findBlocked(Customer customer) {
		int i = 0;
		List<Account> tempList = new ArrayList<Account>();
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			// get account's blocked state
			boolean isBlocked = account.get(i).isBlocked();
			if (isBlocked) {
				// and if it's blocked
				// then add it to temporary list
				tempList.add(account.get(i));
			}

		}

		return tempList;
	}

	public List<Account> findNotBlocked(Customer customer) {
		int i = 0;
		List<Account> tempList = new ArrayList<Account>();
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			// get account's blocked state
			boolean isBlocked = account.get(i).isBlocked();
			if (!isBlocked) {
				// and if it's NOT blocked
				// then add it to temporary list
				tempList.add(account.get(i));
			}

		}

		return tempList;
	}

	public List<Account> findNegative(Customer customer) {
		int i = 0;
		List<Account> tempList = new ArrayList<Account>();
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			// get account's balance
			// and check if it's negative
			double tempBalance = account.get(i).getBalance();
			if (tempBalance < 0) {
				// if it is
				// then add it to temporary list
				tempList.add(account.get(i));
			}

		}

		return tempList;
	}

	public List<Account> findPositive(Customer customer) {
		int i = 0;
		List<Account> tempList = new ArrayList<Account>();
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			// get account's balance
			// and check if it's positive
			double tempBalance = account.get(i).getBalance();
			if (tempBalance >= 0) {
				// if it is
				// then add it to temporary list
				tempList.add(account.get(i));
			}

		}

		return tempList;
	}

	public void sortByBalance(Customer customer) {
		int i = 0;
		int j = 0;
		Account tempAccount;
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {

			for (j = i + 1; j < account.size(); j++) {

				// get two balances to compare them
				double balanceA = account.get(i).getBalance();
				double balanceB = account.get(j).getBalance();

				// sort them!
				if (balanceA < balanceB) {
					tempAccount = account.get(i);
					account.set(i, account.get(j));
					account.set(j, tempAccount);
				}

			}

		}

	}

	public double getBalanceAvailable(Customer customer) {
		int i = 0;
		double sum = 0;
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {
			// if this account is blocked, then ignore it
			if (account.get(i).isBlocked()) {
				continue;
			}
			// get account's balance
			// and check if it's positive
			double tempBalance = account.get(i).getBalance();
			if (tempBalance > 0) {
				// if it is
				// then add balance to sum
				sum += tempBalance;
			}

		}
		return sum;
	}

	public double getBalance(Customer customer) {
		int i = 0;
		double sum = 0;
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {
			// get account's balance
			// and check if it's positive
			double tempBalance = account.get(i).getBalance();
			if (tempBalance > 0) {
				// if it is
				// then add balance to sum
				sum += tempBalance;
			}

		}
		return sum;
	}

	public double getDebt(Customer customer) {
		int i = 0;
		double sum = 0;
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {
			// get account's balance
			// and check if it's negative
			double tempBalance = account.get(i).getBalance();
			if (tempBalance < 0) {
				// if it is
				// then add debt to sum
				sum += tempBalance;
			}

		}
		return sum;
	}

	public double getBalanceDeptRepaid(Customer customer) {
		int i = 0;
		double sum = 0;
		List<Account> account = customer.getAccount();
		for (i = 0; i < account.size(); i++) {
			// get account's balance
			// and add it to the sum
			double tempBalance = account.get(i).getBalance();
			sum += tempBalance;
		}
		return sum;
	}

}
