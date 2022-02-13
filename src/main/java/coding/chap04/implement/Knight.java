package coding.chap04.implement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 챕터 04 (p.115)
 * - 왕실의 나이트
 * - 문제 풀이
 *   - 나이트가 이동할 수 있는 방향의 가짓수를 지정한다.
 */
public class Knight {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    // 움직임 가짓수 지정
    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

    String[] alphabetX = {"a","b","c","d","e","f","g","h"};
    int[] intX = {1,2,3,4,5,6,7,8};

    int count = 0;
    int x = 0;

    for (int i=0;i<8;i++) {
      for (int j=0;j<8;j++) {
        if (input.substring(0,1).contains(alphabetX[j])) {
          x = intX[j];
        }
      }
      if (x - dx[i] > 0 && Integer.parseInt(input.substring(1)) - dy[i] > 0) {
        count++;
      }
    }
    System.out.println(count);
  }

}
