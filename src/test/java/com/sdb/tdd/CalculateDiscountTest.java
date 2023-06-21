package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	@Test
	public void initializeToBuyBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		List<String> bookList = new ArrayList<>();
		String book = "Clean Code (Robert Martin, 2008)";
		bookList.add(book);
		double discount = 0.00;
		assertEquals(50.0, calculateDiscount.getTotalPrice(bookList, discount));
	}

}
