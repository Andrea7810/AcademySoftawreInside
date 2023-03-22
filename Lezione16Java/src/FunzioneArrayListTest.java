import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FunzioneArrayListTest {

	@Test
	void test() {
		
		FunzioneArrayList funzioni = new FunzioneArrayList();
		
		
		ArrayList<Integer> myArr = new ArrayList<>();
		
		myArr.add(10);
		myArr.add(22);
		
		assertTrue(funzioni.areAllEven(myArr));
		
		
		myArr.add(5);
		
		assertFalse(funzioni.areAllEven(myArr));
	}
	
	
	
	@Test
	void test2 () {
		
		FunzioneArrayList funzioni = new FunzioneArrayList();
		
		assertTrue(funzioni.isPrime(13));
		
		ArrayList<Integer> myArr = new ArrayList<>();
		
		myArr.add(5);
		myArr.add(7);
		myArr.add(13);

		
		assertTrue(funzioni.areAllPrime(myArr));
		
		
		
	}
	
	
	
	
	

}
