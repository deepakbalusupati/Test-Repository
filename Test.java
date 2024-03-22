import java.util.Scanner;

class Main {
    public void Sum(int a, int b) {
        int Result = a + b;
        System.out.println(Result);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main myObj = new Main();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        myObj.Sum(x, y);
    }
}