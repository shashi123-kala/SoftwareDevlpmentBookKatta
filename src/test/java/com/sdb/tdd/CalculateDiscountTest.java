package com.sdb.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sdb.entity.SoftwareDevelopmentBookSetDiscount;

public class CalculateDiscountTest {

	CalculateDiscount calculateDiscount = new CalculateDiscount();
	public static final String SOFTWARE_DEVELOPMENT_BOOK_I = "Clean Code (Robert Martin, 2008)";
	public static final String SOFTWARE_DEVELOPMENT_BOOK_II = "The Clean Coder (Robert Martin, 2011)";

	@BeforeEach
	public void setup() {
		List<SoftwareDevelopmentBookSetDiscount> byDifferentCopiesDiscountList = new ArrayList<>();
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(2, 5));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(3, 10));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(4, 20));
		byDifferentCopiesDiscountList.add(new SoftwareDevelopmentBookSetDiscount(5, 25));
	}

	@Test
	public void initializeToBuyBook() {
		assertNotNull(calculateDiscount);
	}

	@Test
	public void buyingOneBook() {
		List<String> bookList = new ArrayList<>();
		bookList.add(SOFTWARE_DEVELOPMENT_BOOK_I);
		double discount = 0.00;
		assertEquals(50.0, calculateDiscount.getTotalPrice(bookList, discount));
	}

	@Test
	public void buyingTwoCopiesOfDifferentBook() {
		List<String> bookList = new ArrayList<>();
		double discount = 5;
		bookList.add(SOFTWARE_DEVELOPMENT_BOOK_I);
		bookList.add(SOFTWARE_DEVELOPMENT_BOOK_II);
		assertEquals(95.0, calculateDiscount.getTotalPrice(bookList, discount));
	}

}
