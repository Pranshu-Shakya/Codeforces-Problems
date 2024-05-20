// https://codeforces.com/problemset/problem/677/A
import java.util.Scanner;
public class Fence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        arr[i] = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++) {
            if(arr[i] <= h)
            count+=1;
            else
            count+=2;
        }
        System.out.println(count);
    }
}
