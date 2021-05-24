package pkgUT;


import org.apache.poi.ss.formula.functions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import pkgLogic.Loan;

public class TestgetTotalPayment {

	@Test
	public void TestgetTotalPayment() {
		
		Loan test = new Loan(72000,3.59,20, LocalDate.of(2021, 6, 1), 100,0);
		assertEquals(test.getTotalPayments(),93048.88,.01);
		assertEquals(test.getTotalInterest(),21048.88,.01);
		test.setAdditionalPayment(0);
		assertEquals(test.getTotalPayments(),101018.03,.01);
		assertEquals(test.getTotalInterest(),29018.03,.01);
	}

}

 

