package by.htp.les03.account.entity;

public class Account {

	private int id;
	private double balance;
	private boolean blocked;

	public Account() {
	}

	public Account(int id, double balance, boolean blocked) {
		this.id = id;
		this.balance = balance;
		this.blocked = blocked;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean isBlocked() {
		return this.blocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + id;
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (blocked != other.blocked)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id + ", balance=" + balance + ", blocked=" + blocked + "\n";
	}

}
