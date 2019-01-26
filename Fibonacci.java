 public class Fibonacci {

// fibonacci 0 1 1 2 3 5 8 13 21

public int fibonacci (int n, String type) {

	if (type.equals("recursive")) {
		return fibonacci_recursive(n); // calls function
	}

	else { return fibonacci_iterative(n); }

}

public int fibonacci_iterative (int num) {

	if (num <= 1) {return 1; }

	int result = 0;
	int b = 0;
	int a = 1 ;

	for (int x = 2; x <=num; x++) {

		result = a + b;
		b = a;
		a = result;

	}
		return result ;

}

public int fibonacci_recursive(int num){

	if (num <= 1) {
		return num; 
	}

	return fibonacci_recursive(num-1) + fibonacci_recursive(num-2);

	}





 }