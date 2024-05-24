// https://codeforces.com/problemset/problem/344/A
import java.util.Scanner;
public class Magnets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(i>0) {
                if(arr[i-1] != arr[i])
                count++;
            }
        }
        System.out.println(count+1);
    }
}
