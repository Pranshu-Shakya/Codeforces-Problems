// https://codeforces.com/problemset/problem/734/A
import java.util.Scanner;
public class Chess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int countA = 0, countD = 0;
        for(int i = 0; i<n; i++) {
            if(s.charAt(i) == 'A')
            countA++;
            else
            countD++;
        }
        if(countA > countD)
        System.out.println("Anton");
        else if(countA < countD)
        System.out.println("Danik");
        else
        System.out.println("Friendship");
    }
}
