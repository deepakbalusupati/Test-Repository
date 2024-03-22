class Fibonacci {
	static int[] F = new int[10];
	static int fibonacci(int n) {
		if (n <= 1) {
            F[n] = n;
            return n;
        } else {
            if (F[n - 2] == -1) {
                F[n - 2] = fibonacci(n - 2);
            }
            if (F[n - 1] == -1) {
                F[n - 1] = fibonacci(n - 1);
            }
            return F[n - 2] + F[n - 1];
        }
	}
}

public class anotherTest {
	public static void main(String[] args) {
		Fibonacci myObj = new Fibonacci();
		int finalRes = myObj.fibonacci(5);
		System.out.println(finalRes);
	}
}
