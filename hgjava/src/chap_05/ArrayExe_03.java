package chap_05;

public class ArrayExe_03 {

	public static void main(String[] args) {
		String[] nameAry = {"홍길동","김길동","박길동","홍길동","황길동","최길동","홍길동"};
		
		String search = "홍길동";
		int count = 0;
		
		//교수님 풀이
		for(String name : nameAry) {
			if (name.equals(search)) {
				count++;
			}
		}
		
		//수지씨 풀이
		for (int i = 0; i <nameAry.length; i++) {
			if(nameAry[i].equals(search)) {
				count++;
			}
		}
		
		System.out.println(search + "은 총 " + count + "명 입니다.");
		
		int[] scores = {88, 68, 72, 89, 92, 70};
		int maxScore = 0;
		for (int num : scores) { //반복문. scores 갯수만큼만 반복해서 num에 넣어준다. 책 p197
			if (maxScore < num) {
				maxScore = num;
			}
		}
		System.out.println("제일 큰 수 : " + maxScore);

	}

}
