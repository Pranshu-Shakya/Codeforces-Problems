// https://codeforces.com/problemset/problem/467/A
import java.util.Scanner;
public class Accommodation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int people[][] = new int[n][2];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<2; j++)
            people[i][j] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(people[i][1] - people[i][0] >=2)
            count++;
        }
        System.out.println(count);
    }
}
