package coding.chap03.greedy;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 챕터 03 (p.97)
 * - 숫자 카드 게임
 * - 문제 풀이
 *   - 각 행마다 가장 작은 수를 찾은 뒤에 그 수 중에서 가장 큰 수를 찾는다.
 */
public class CardGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();       // 행
    int column = sc.nextInt();    // 열

    int[][] matrix = new int[row][column];

    int result = 0;

    for (int i=0; i<row; i++) {
      for (int j=0;j<column;j++) {
        matrix[i][j] = sc.nextInt();
      }
      Arrays.sort(matrix[i]);
      if (result < matrix[i][0]){
        result = matrix[i][0];
      }
    }

    System.out.print(result);
  }

}
