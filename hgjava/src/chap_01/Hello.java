package chap_01;

import java.io.IOException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello, Java");
		
		int x = 5;
		int y = x + 10;
		System.out.println(y);
		
		double z = 3.5;
		System.out.println(z);
		System.out.println("y = " + y);
		
	//���� : ������ �� ��ȯ
		x = 3;
		y = 10;
		System.out.println("x:" + x + ", y:" + y);
		//�� ��ȯ
		int temp = x;
		x = y;
		y = temp;
		//���
		System.out.println("x:" + x + ", y:" + y);
		
	//�⺻ Ÿ��
		//ũ�� ���� : byte < short < char(ĳ���ʹ� ����ǥ�� �Ұ�) < int < long
		
		char charData = 'a';
		int intData = charData;
		System.out.println("char : " + charData + ", int : " + intData);
		
		charData = 'A';
		intData = charData;
		System.out.println("char : " + charData + ", int : " + intData);
		// '' : �ѱ���, "" : ���ڿ�. ���ڿ��� ��Ʈ�� Ÿ��

	//Ÿ�Ժ�ȯ
		System.out.println("Ÿ�Ժ�ȯ");
		char c1 = 'a';
		int c2 = c1 + 2; //�ڵ�Ÿ�� ��ȯ	
		char c3 = (char)c2; //���� Ÿ�� ��ȯ
		System.out.println(c2 + " c3 : " + c3);
		//90�� printf�� ����
		System.out.printf("c2���� : %d, c3���� : %s \n",c2,c3);
		System.out.println("c2���� :" + c2 + " c3���� :" +  c3); //�ΰ��� ���� ������. printf, println�� �Է� ����� ����.
		
		x = 5;
		y = 2;
		double result = (double)x / y;
		System.out.println(result);
		
		double v1 = 3.5;
		double v2 = 2.7;
		int result2 = (int)(v1 + v2);
		System.out.println(result2);
		
		//Ȯ�ι��� 9��.
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result3 = (int)(var1 + var2 + var3) + (int)(Double.parseDouble(var4));
		System.out.println(result3);
		
	//ǥ���Է� : Ű���� => System.in.read()
		//���� : �ѱ��ڸ� �о���̱⶧���� �빮�ڿ��� ���� ����.
		System.out.println("���� 92��");
		
//		int keyCode;
//		while(true) {
//			keyCode = System.in.read();
//			System.out.println("keyCode : " + keyCode);
//			if(keyCode == 113) {
//				break;
//			}
//		}
//		System.out.println("����");
		
		//���ڿ� �Է��ϱ� ���� Scanner Ŭ���� (������ �����ϱ� ���� ��ġ) -> �� Ŭ������ �̿��� ��ü�� �����ؼ� ���
		String scinput;
		Scanner sc = new Scanner(System.in); //����Ʈ ������ ���� "��Ʈ��+����Ʈ+O" �������. System.in �� �ΰ��� �����Ŵ� �ּ�ó��
		while(true) {
			System.out.print("�̸� �Է� : ");
			scinput = sc.nextLine();
			if(scinput.equals("q")) {
				break;
			}
			System.out.println("�� �̸��� " + scinput);
		}
		System.out.println("����");

		System.out.print("�� �Է� : ");
		scinput = sc.nextLine();
		System.out.println(scinput + 10); //���ڿ��� ����
		System.out.println(Integer.parseInt(scinput) + 10); //��갡���� ���ڷ� ����
		
		
		sc.close(); //�Է���ġ �ݾ���

		
		
	} //end main

} //end class Hello
