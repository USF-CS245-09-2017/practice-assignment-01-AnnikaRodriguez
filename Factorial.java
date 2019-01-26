public class Factorial {

// test factorial calls this function where type is 
	//iterative or recursive 
// 4! = 4 * 3 * 2 * 1 = x * x-1 * x- 2


	public int factorial (int n, String type){

		if (type.equals("recursive")){
			return factorial_recursive(n);
		}

		else { return factorial_iterative(n); }


	}


	public int factorial_iterative (int num) {

		int total = 1; 

		for (int x = 1; x <= num; x++) {
			total *= x ; 
		}

		return total ;

	}


	public int factorial_recursive (int num) {

		if (num <= 1) { return 1 ; }

		return num * factorial_recursive(num - 1);  

 		}	



}