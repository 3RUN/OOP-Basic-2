package by.htp.les03.travel.entity;

import java.util.*;

public class TouristAgency {

	private String name;
	private List<Voucher> voucher;

	public TouristAgency() {
	}

	public TouristAgency(String name, List<Voucher> voucher) {
		this.name = name;
		this.voucher = voucher;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVouchers(List<Voucher> voucher) {
		this.voucher = voucher;
	}

	public String getName() {
		return this.name;
	}

	public List<Voucher> getVouchers() {
		return this.voucher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((voucher == null) ? 0 : voucher.hashCode());
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
		TouristAgency other = (TouristAgency) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (voucher == null) {
			if (other.voucher != null)
				return false;
		} else if (!voucher.equals(other.voucher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TouristAgency [name=" + name + ", voucher=" + voucher + "]";
	}

}
