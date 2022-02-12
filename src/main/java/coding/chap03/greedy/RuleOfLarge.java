package coding.chap03.greedy;

import java.util.*;

/*
 * 챕터 03 (p.93)
 * - 큰 수의 법칙
 * - 문제 풀이
 *   - 입력 값 중 가장 큰 수와 두 번째로 큰 수를 저장
 */
public class RuleOfLarge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();   // 배열의 크기
    int m = sc.nextInt();   // 더할 수 있는 횟수
    int k = sc.nextInt();   // 연속으로 더할 수 있는 횟수

    int[] arr = new int[n];
    for (int i=0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr); // 배열 정렬하기
    int max = arr[n-1];
    int nextMax = arr[n-2];

    // 가장 큰 수의 k 배가 주어진 덧셈 횟수를 k번 나누는 것 만큼 더해진다.
    // 나머지는 총 횟수의 나머지를 뺀 값만큼 더해진다.

    int result = max * k * (m/k) + nextMax * (m%k);
    System.out.println(result);

  }
}
