package 연습용;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		boolean run = true;

		Scanner scn = new Scanner(System.in);
		ProductExe exe = new ProductExe();

		while (run) {
			System.out.println("1.상품관리 2.입출고관리 3.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 1. 상품관리
				System.out.println("1.상품등록 2.상품수정 3.목록");
				int prodmenu = Integer.parseInt(scn.nextLine());

				switch (prodmenu) {
				case 1: //1-1.상품등록

					System.out.println("상품 코드입력(예: P001)");
					String prodCode = scn.nextLine();
					System.out.println("상품 이름입력");
					String prodName = scn.nextLine();
					System.out.println("상품 가격입력");
					int price = Integer.parseInt(scn.nextLine());

					Product prodprod = new Product(prodCode, prodName, price);

					if (exe.addProduct(prodprod)) {
						System.out.println("저장완료");
					} else {
						System.out.println("저장실패");
					}

					break;

				case 2: //1-2.상품수정
					System.out.println("수정할 상품 코드 입력");
					prodCode = scn.nextLine();
					System.out.println("가격 입력");
					price = Integer.parseInt(scn.nextLine());

					if (exe.modifyProd(prodCode, price)) {
						System.out.println("수정완료");
					} else {
						System.out.println("수정실패");
					}

					break;

				case 3: //1-3.목록
					System.out.println("목록");
				
					for (Product prodInfo : exe.getProdList()) {
						if (prodInfo != null) {
							prodInfo.showInfo();
						}
					}

				}// end of switch prodmenu
				//case 1. 전체 끝.
				break;
				
			case 2: // 입출고관리
				switch (menu) {
				case 1:
					System.out.println("판매");
					String sell = scn.nextLine();
					break;
				case 2:
					System.out.println("구매");
					String buy = scn.nextLine();
					break;
				case 3:
					System.out.println("재고");
					String stock = scn.nextLine();
					break;
				}
				continue;

			case 3: // 종료
				System.out.println("종료");
				run = false;

			}

		} // end of while

//	--상품관리앱
//	1. 상품관리 2.입출고관리 3.종료
//	1-1 등록 1-2 수정 1-3 목록
//	2-1 판매 2-2 구매 2-3 재고

//	재고
//	P001 5(개)
//	P002 3
//	N001 10
//	N002 12

	}// end of main
}// end of class