package by.htp.les03.account.entity;

import java.util.*;

public class Customer {

	private String fullName;
	private List<Account> account;

	public Customer() {
		this.account = new ArrayList<Account>();
	}

	public Customer(String fullName, List<Account> account) {
		this.fullName = fullName;
		this.account = account;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public String getFullName() {
		return this.fullName;
	}

	public List<Account> getAccount() {
		return this.account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [fullName=" + fullName + ", account=" + account + "]";
	}

}
