// https://codeforces.com/problemset/problem/228/A
import java.util.Scanner;
import java.util.Arrays;
public class MyClass {
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for(int i=0; i<4; i++)
        a[i] = sc.nextInt();
        Arrays.sort(a);
        int count = 1, sum = 0;
        for(int i=0; i<3; i++) {
            if(a[i] == a[i+1]) {
                count++;
            } else {
                sum += (count-1);
                count = 1;
            }
        }
        if(count != 1)
        System.out.println(sum+(count-1));
        else
        System.out.println(sum);
  }
}
