package chap_04;

public class Game_369 {

	public static void main(String[] args) {
		// 1~50 : 369����

		// 3,6,9 ������ ���� üũ ����

		int heart = 0;

		// �ݺ������� ���� 1~50���� �߻�
		// ���� �ڸ��� 3,6,9 ���� üũ
		for (int i = 1; i <= 50; i++) {
			
			heart = 0;
			//�����ڸ�
			if (i % 10 == 3 | i % 10 == 6 | i % 10 == 9) {
				heart++;
			}
			//���� �ڸ�
			if (i / 10 == 3) {
				heart++;
			}
			
			if (heart == 0) {
				System.out.print(i + "\t");
			} else if (heart == 1) {
				System.out.print("��\t");
			} else {
				System.out.print("�ܡ�\t");
			}
			
			if (i % 10 == 0) {
				System.out.println();
			}
		}

		// ���� �ڸ��� 3,6,9 ���� üũ

		// ������ 0 => ���� ���
		// ������ 1 -> ��
		// ������ 2 -> ��


		//������ Ǯ��
		//369 ���� üũ ���� 
		int cnt = 0;
		//���� 1~50 �ݺ���
		for(int i = 1; i <= 50; i++) {
			cnt = 0; //���� ���� ���� �ʱ�ȭ
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) cnt++; //���� �ڸ��� 369���� üũ
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) cnt++; //���� �ڸ��� 369���� üũ
			//������ 0 -> ����, ������ 1 -> ��, ������ 2 -> ����
			switch(cnt) {
			case 0 : System.out.print(i + "\t"); break;
			case 1 : System.out.print("��\t"); break;
			case 2 : System.out.print("����\t"); break;
			}
			if(i % 10 == 0) System.out.println(); //���ٿ� 10���� ���
		}
		
		//���� �����ߴ� ���
		
		int num2 = 1;
		String blink = "";
		for(int i = 1; i <= 50; i++) {
			blink = "";
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				blink += "��";
			}
			if(i / 10 == 3) {
				blink += "��";
			}
			if (i % 10 != 3 && i % 10 != 6 && i % 10 != 9 && i / 10 != 3){
				blink += i;
			}
			System.out.print(blink +"\t");
			if(i % 10 == 0)System.out.println();
		}
			
		
		//for... ����� �׽�Ʈ�� �߰�
		for() {
			System.out.println(askd);
		}
		
		
		
		
		
		
	}
}