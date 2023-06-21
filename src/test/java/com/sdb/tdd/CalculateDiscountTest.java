package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {

	public static final String SOFTWARE_DEVELOPMENT_BOOK_I = "Clean Code (Robert Martin, 2008)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_II = "The Clean Coder (Robert Martin, 2011)";

	@Test
	public void initializeToBuyBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		List<String> bookList = new ArrayList<>();
		bookList.add(SOFTWARE_DEVELOPMENT_BOOK_I);
		double discount = 0.00;
		assertEquals(50.0, calculateDiscount.getTotalPrice(bookList, discount));
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		CalculateDiscount calculateDiscount = new CalculateDiscount();
		List<String> bookList = new ArrayList<>();
		double discount = 5;
		bookList.add(SOFTWARE_DEVELOPMENT_BOOK_I);
		bookList.add(SOFTWARE_DEVELOPMENT_BOOK_II);
		assertEquals(95.0, calculateDiscount.getTotalPrice(bookList, discount));
	}

}
