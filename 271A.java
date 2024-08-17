// https://codeforces.com/problemset/problem/271/A
import java.util.Scanner;
import java.util.Arrays;
public class MyClass {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int y = sc.nextInt();
      for(int i = y+1; ; i++) {
          char ch[] = String.valueOf(i).toCharArray();
          Arrays.sort(ch);
          int count = 0;
          for(int j = 0; j<3; j++) {
              if(ch[j] == ch[j+1])
              break;
              else
              count++;
          }
          if(count == 3) {
            System.out.println(i);
            break;
          }
      }
  }
}
