package es.upm.grise.profundizacion.fibonacci;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;


import java.util.concurrent.TimeUnit;

public class FibonacciTest {

//	@BeforeAll
//	static public void beforeAll() {
//		System.out.println("Executed before any test has been run");
//	}
//	
//	@AfterAll
//	static public void afterAll() {
//		System.out.println("Executed after all tests have been run");
//	}
//	
//	@BeforeEach
//	public void beforeEach() {
//		System.out.println("Executed before each test");
//	}
//	
//	@AfterEach
//	public void afterEach() {
//		System.out.println("Executed after each test");
//	}

	
	@DisplayName("The fibonacci of 0 is 0")
	@Test()
	public void value_0_returns_0() throws InvalidNumberException {
		assertEquals(0, Fibonacci.calculate(0));
	}

	@Test
	public void value_1_returns_1() throws InvalidNumberException {
		assertEquals(1, Fibonacci.calculate(1));
	}

	@Test
	public void value_10_returns_55() throws InvalidNumberException {
		assertEquals(55, Fibonacci.calculate(10));
	}
	
	@Test
	//@Timeout(value = 4, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void value_47_returns_2971215073() throws InvalidNumberException {
		assertEquals(2971215073L, Fibonacci.calculate(47));
	}
	
//	@Test
//	public void value_92_returns_7540113804746346429() throws InvalidNumberException {
//		assumingThat(
//				Fibonacci.TYPE.equals("Iterative"),
//				() -> assertEquals(7540113804746346429L, Fibonacci.calculate(92)));
//	}
	
	@Disabled
	@Test
	public void value_93_Throws_Exception() throws InvalidNumberException {
		assertThrows(InvalidNumberException.class, () -> Fibonacci.calculate(93));
	}
	
//	@Test
//	public void value_Minus_1_Throws_Exception() throws InvalidNumberException {
//		assertThrows(InvalidNumberException.class, () -> Fibonacci.calculate(-1));
//	}
}
