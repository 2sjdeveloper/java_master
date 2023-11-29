package chap_06;
//정렬하는 클래스..?

public class ArraySortExe {
	public static void main(String[] args) {
		int[] numAry = { 6, 2, 1, 5, 4, 10, 3 };

		// 정렬작업
		int temp = 0;
		for (int j = 0; j < numAry.length - 1; j++) {
			//위치변경작업
			for (int i = 0; i < numAry.length - 1; i++) { // 두개의 숫자를 비교하는거니까 횟수를 렝스 빼기 1
				if (numAry[i] > numAry[i + 1]) {
					temp = numAry[i];
					numAry[i] = numAry[i + 1];
					numAry[i + 1] = temp;
				}
			}
		}

		for (int num : numAry)
			System.out.println(num);
	}
}
