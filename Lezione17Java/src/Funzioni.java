import java.util.ArrayList;

public class Funzioni {

	
	
	
	
	
	
	public boolean isSequencePerfect (ArrayList<Integer> myArr) {
		
		if ( myArr.size() != 27)
			return false;
		
		int j = 0;
				
		for (int i = 0; i <= 9; i++) {
			
			do {
				if (myArr.contains(i)) {
					
					myArr.remove((Integer) i);
					
				}  else 
					
					return false;
				j++;
				
			} while (j < 3);

			j = 0;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
}
