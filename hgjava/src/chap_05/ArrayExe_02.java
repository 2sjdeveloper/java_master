package chap_05;

public class ArrayExe_02 {

	public static void main(String[] args) {
	// ������ ���� �� �ִ� �迭�� �����Ͻÿ�(ũ��� 10���� ������ ����).
		// ���� �̸� : intAry : 10���� 100���� ����.
		// ��� �ڵ� �ۼ�.
		
		
		//�̰� ���� �Ѱ�
//		int sum = 0;
//		int[] intAry = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		for(int i = 0; i < intAry.length; i++) {
//		sum = sum + intAry[i];
//		}
//		System.out.println("intAry ���� : " + sum);

		
		//������ Ǯ��
		int[] intAry = new int[10]; // {10,20,30,40....100}
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (i + 1) * 10;
		}
		
		//��� Ȯ��for ����
		int sum = 0; //50���� ū ���� ����.
		double avg = 0;
		int count = 0;
		for(int num : intAry) {
			System.out.println(num);
			if (num > 50) { // 50���� ū ���� sum�� �����ϱ� ���� if��.
				sum = sum + num;
			
				count++;
			}
		}
		avg = sum/count;
		
		System.out.println("50���� ū ���� �հ�: " + sum);
		System.out.println("50���� ū ���� ���: " + avg);
				
		
		

	
	}
}
