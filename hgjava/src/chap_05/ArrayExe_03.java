package chap_05;

public class ArrayExe_03 {

	public static void main(String[] args) {
		String[] nameAry = {"ȫ�浿","��浿","�ڱ浿","ȫ�浿","Ȳ�浿","�ֱ浿","ȫ�浿"};
		
		String search = "ȫ�浿";
		int count = 0;
		
		//������ Ǯ��
		for(String name : nameAry) {
			if (name.equals(search)) {
				count++;
			}
		}
		
		//������ Ǯ��
		for (int i = 0; i <nameAry.length; i++) {
			if(nameAry[i].equals(search)) {
				count++;
			}
		}
		
		System.out.println(search + "�� �� " + count + "�� �Դϴ�.");
		
		int[] scores = {88, 68, 72, 89, 92, 70};
		int maxScore = 0;
		for (int num : scores) { //�ݺ���. scores ������ŭ�� �ݺ��ؼ� num�� �־��ش�. å p197
			if (maxScore < num) {
				maxScore = num;
			}
		}
		System.out.println("���� ū �� : " + maxScore);

	}

}
