// https://codeforces.com/problemset/problem/705/A
import java.util.Scanner;
public class Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String hate = "I hate ";
        String love = "I love ";
        for(int i = 0; i<n; i++) {
            if(i % 2 == 0) {
                System.out.print(hate);
            } else {
                System.out.print(love);
            }
            if(i != (n-1))
            System.out.print("that ");
            if(i == (n-1))
            System.out.print("it");
        }        
 
        sc.close();
    }
}
