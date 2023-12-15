package todo_p20231206;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		// 1.상품관리 2.입출고관리 3.종료
		// 1-1)등록 1-2)수정 1-3)목록
		// 2-1)판매 2-2)구매 2-3)재고
		boolean run = true;
		boolean subRun = true;
		
		Scanner sc = new Scanner(System.in);
		
		ProductExe exe = new ProductExe();
		InOutExe ex = new InOutExe();

		while(run) {
			int menu = 0;
			int subMenu = 0;
			System.out.println("1.상품관리 2.입출고관리 3.종료");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: //상품관리
				while(subRun) {
					System.out.println("***상품관리 프로그램***");
					System.out.println("1)등록 2)수정 3)목록 4)메인메뉴보기");
					subMenu = Integer.parseInt(sc.nextLine());
					switch(subMenu) {
					case 1: //등록
						System.out.println("상품코드 / 상품명 / 가격");
						String input = sc.nextLine();
						String[] inAry = input.split(" ");
						String code = inAry[0];
						String name = inAry[1];
						int price = Integer.parseInt(inAry[2]);
						
						Product pro = new Product(code, name, price);
						if(exe.addProduct(pro)) {
							System.out.println("상품등록완료!");
						}else {
							System.out.println("등록실패..");
						}
						break;
					case 2: // 수정
						System.out.println("상품코드 입력>>> ");
						code = sc.nextLine();
						System.out.println("수정할 가격 입력>>> ");
						price = Integer.parseInt(sc.nextLine());
						if(exe.modifyProduct(code, price)){
							System.out.println("가격수정 완료!");
						}else {
							System.out.println("수정실패..");
						}
						break;
					case 3: // 목록
						System.out.println("상품코드  상품명  가격");
						System.out.println("===========================");
						ArrayList<Product> goods = exe.getProductList();
						for(Product pros : goods) {
							pros.showInfo();
						}
						break;
					case 4:
						System.out.println("메인메뉴로 돌아갑니다.");
						subRun = false;
					}
				}
				break;
			case 2: // 입출고관리 -> 조금더 생각해보고 구현해야함....
				while(subRun) {
					System.out.println("***상품관리 프로그램***");
					System.out.println("1)판매 2)구매 3)재고 4)메인메뉴보기");
					subMenu = Integer.parseInt(sc.nextLine());
					switch(subMenu) {
					case 1: //판매
						System.out.println("상품코드 / 처리날짜 / 수량 / 판매");
						String input = sc.nextLine();
						String[] inputAry = input.split(" ");
						String code = inputAry[0];
						String processDate = inputAry[1];
						int count = Integer.parseInt(inputAry[2]);
						String trading = inputAry[3];
						break;
					case 2: //구매
						System.out.println("상품코드 / 처리날짜 / 수량 / 구매");
						input = sc.nextLine();
						inputAry = input.split(" ");
						code = inputAry[0];
						processDate = inputAry[1];
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						count = Integer.parseInt(inputAry[2]);
						trading = inputAry[3];
						
						try {
							InOut inout = new InOut(code, sdf.parse(processDate), count, trading);
							if(ex.addInOut(inout)) {
								System.out.println("구매가 완료되었습니다.");
							}else {
								System.out.println("구매처리 실패...");
							}
						} catch (ParseException e) {
							e.printStackTrace();
						}
						
						System.out.println("상품코드 / 처리날짜 / 수량 / 구매");
						System.out.println("===========================");
						ArrayList<InOut> inouts = ex.getInOuttList();
						for(InOut io : inouts) {
							io.showInOut();
						}
						ex.doSale(code, count);
						
						
						
						break;
					case 3: //재고
						int total = 0;
						break;
					case 4:
						System.out.println("메인메뉴로 돌아갑니다.");
						subRun = false;
					}
				}
				break;
			case 3: // 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
			
			}//end of switch
			
		}// end of while
		System.out.println("end of prog");
	}

}





///////////////////////////내가 한거






//package todo_p20231206;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ProductApp {
//	public static void main(String[] args) {
//		boolean run = true;
//
//		Scanner scn = new Scanner(System.in);
//		ProductExe exe = new ProductExe();
//
//		while (run) {
//			System.out.println("1.상품관리 2.입출고관리 3.종료");
//			int menu = Integer.parseInt(scn.nextLine());
//
//			switch (menu) {
//			case 1: // 1. 상품관리
//				System.out.println("1.상품등록 2.상품수정 3.목록");
//				int prodmenu = Integer.parseInt(scn.nextLine());
//
//				switch (prodmenu) {
//				case 1: //1-1.상품등록
//
//					System.out.println("상품 코드입력(예: P001)");
//					String prodCode = scn.nextLine();
//					System.out.println("상품 이름입력");
//					String prodName = scn.nextLine();
//					System.out.println("상품 가격입력");
//					int price = Integer.parseInt(scn.nextLine());
//
//					Product prodprod = new Product(prodCode, prodName, price);
//
//					if (exe.addProduct(prodprod)) {
//						System.out.println("저장완료");
//					} else {
//						System.out.println("저장실패");
//					}
//
//					break;
//
//				case 2: //1-2.상품수정
//					System.out.println("수정할 상품 코드 입력");
//					prodCode = scn.nextLine();
//					System.out.println("가격 입력");
//					price = Integer.parseInt(scn.nextLine());
//
//					if (exe.modifyProd(prodCode, price)) {
//						System.out.println("수정완료");
//					} else {
//						System.out.println("수정실패");
//					}
//
//					break;
//
//				case 3: //1-3.목록
//					System.out.println("목록");
//				
//					for (Product prodInfo : exe.getProdList()) {
//						if (prodInfo != null) {
//							prodInfo.showInfo();
//						}
//					}
//
//				}// end of switch prodmenu
//				//case 1. 전체 끝.
//				break;
//				
//			case 2: // 입출고관리
//				switch (menu) {
//				case 1:
//					System.out.println("판매");
//					String sell = scn.nextLine();
//					break;
//				case 2:
//					System.out.println("구매");
//					String buy = scn.nextLine();
//					break;
//				case 3:
//					System.out.println("재고");
//					String stock = scn.nextLine();
//					break;
//				}
//				continue;
//
//			case 3: // 종료
//				System.out.println("종료");
//				run = false;
//
//			}
//
//		} // end of while
//
////	--상품관리앱
////	1. 상품관리 2.입출고관리 3.종료
////	1-1 등록 1-2 수정 1-3 목록
////	2-1 판매 2-2 구매 2-3 재고
//
////	재고
////	P001 5(개)
////	P002 3
////	N001 10
////	N002 12
//
//	}// end of main
//}// end of class