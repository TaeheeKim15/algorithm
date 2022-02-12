package coding.chap03.greedy;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

/*
 * 챕터 03 (p.99)
 * - 1이 될 때까지
 * - 문제 풀이
 *   - 최대한 많이 나누기
 */
public class ReachOne {
  // 수행 방법
  // 1. N에서 1을 뺀다.
  // 2. N을 K로 나눈다.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int cnt = 0;
    while (n != 1) {
      if (n % k != 0) {
        n -= 1;
        cnt++;
      }
      while (n % k == 0) {
        n = n / k;
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
