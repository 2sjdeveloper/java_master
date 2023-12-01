package todo_p20231201;

public class MainExe {
	public static void main(String[] args) {
		int[][] numAry = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// int [][] <<2차원 배열

		System.out.println(numAry[3][1]); // numAry[가로][세로]

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", numAry[i][j]);
			}
			System.out.println(); // 내부 for문 다 돌고 나오면 줄바꿈.
		}
		System.out.println("======= end =======");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", numAry[j][i]);
			}
			System.out.println(); // 내부 for문 다 돌고 나오면 줄바꿈.
		}
		System.out.println("======= end =======");

		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", numAry[i][j]);
			}
			System.out.println(); // 내부 for문 다 돌고 나오면 줄바꿈.
		}
		System.out.println("======= end =======");

	}

}
