// https://codeforces.com/problemset/problem/617/A
import java.util.*;
public class Elephant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n > 5) && (n % 5 != 0))
        System.out.print((n/5)+1);
        else if((n>5) && (n % 5 ==0))
        System.out.print(n/5);
        else
        System.out.print(1);
    }
}

// another short solution
// credit: https://github.com/YehiaAE/Codeforces-solutions/blob/master/617A%20%E2%80%93%20Elephant.java
import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println((x + 4) / 5);
    }
}
