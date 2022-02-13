package coding.chap04.implement;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

/*
 * 챕터 04 (p.113)
 * - 시각
 * - 문제 풀이
 *   - 3중 반복문을 돌려 해결한다.
 */
public class Clock {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    String result = "";
    int count = 0;
    for (int i = 0; i < input+1; i++) {  // N시
      for (int j = 0; j < 60; j++) {  // N분
        for (int k = 0; k < 60; k++) {  // N초
          result = Integer.toString(i)+Integer.toString(j)+Integer.toString(k);
          if (result.contains("3")) {
            count++;
          }
          result ="";
        }
      }
    }
    System.out.println(count);
  }
}
