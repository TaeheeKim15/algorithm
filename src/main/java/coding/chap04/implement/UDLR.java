package coding.chap04.implement;

import java.util.Scanner;

/*
 * 챕터 04 (p.111)
 * - 상하좌우
 * - 문제 풀이
 *   - 명령에 따라 차례로 이동한 후 횟수를 센다.
 */
public class UDLR {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();  // 버퍼 비우기
    String[] roads = sc.nextLine().split(" "); // 공백을 기준으로 자르기
    int x = 1, y = 1;

    int[] dx = {0,0,-1,1};
    int[] dy = {-1,1,0,0};
    char[] types = {'L', 'R', 'U', 'D'};

    for (int i=0; i < roads.length; i++) {
      // charAt()
      // : String으로 저장된 문자열 중에서 한 글자만 선택하여 char로 변환
      char road = roads[i].charAt(0);
      int nx = -1, ny = -1;
      for (int j=0; j < 4; j++) {
        if (road == types[j]) {
          nx = x + dx[j];
          ny = y + dy[j];
        }
      }

      // 공간을 벗어나는 경우 처리
      if (nx < 1 || ny < 1 || nx > n || ny > n) {
        continue;
      }

      // 이동 수행
      x = nx;
      y = ny;
      }

    System.out.println(x + " " + y);
    }

  }

  /*
   * java Scanner 버퍼 비우기
   *
   * - nextInt() 는 입력 장치를 통해 큐 (파이프) 형태로 들어온 값들 중에서 다음 정수를 가져오는 것
   * - 문제는 nextInt()를 한 뒤 들어온 값 중 Enter나 공백을 기준으로 그 앞의 int형 값을 가져옴!!
   * - 그래서 nextInt() 한 뒤 뒤에오는 nextLine()은 큐에 남아 있던 공백 문자열을 가져오고 출력함
   * - 따라서 다음 값을 받기 위해서는 스캐너.nextLine();을 실행하여 큐(버퍼)에 담긴 값을 비워준다.
   */

