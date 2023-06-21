package com.sdb.tdd;

import java.util.List;

public class CalculateDiscount {

	public double getTotalPrice(List<String> bookList, double dis) {
		double amtAfterDis = 0.00;
		int noOfBooks = bookList.size();
		double count = noOfBooks * 50.00;
		amtAfterDis = count - (count * (dis / 100));
		return amtAfterDis;
	}

}
