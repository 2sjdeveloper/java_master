package chap_05;

public class ArrayExe_01 {

	public static void main(String[] args) {
		int a = 10;
		int[] ary = {10, 20, 33, 25, 34};  //실제 값을 담음

	//설정된 값을 다 더하는 식 만들기.	
		int sum = 0;
		// sum = ary[0] + ary[1] + ary[2]; //이렇게 해도 되지만 갯수가 많아지면 코드가 복잡해짐.
		for(int i = 0; i < ary.length; i++) { //length 는 <= 에서 같다는 표시를 빼줌. 
			sum = sum + ary[i];
		}
		System.out.println("합계는 " + sum + "입니다.");
		
		
		int[] intAry = new int[5];
		System.out.println(intAry[0]);
		
		double[] heights = new double[3];
		System.out.println(heights[0]); //int, double 등 자기 값에 맞게 초기값이 할당되어져 있음.
		
		
		String[] names = new String[10];  //배열에 공간만 선언
		names[0] = "홍길동";  //변수 이름에 인덱스값을 붙일때는 [대괄호]로 해준다
		names[1] = "김길동";
		System.out.println(names[0]);
		System.out.println(names[2]);

	}

}
