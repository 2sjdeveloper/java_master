package todo_p20231206;

import java.util.ArrayList;

public class ProductExe {
	// 컬렉션 필드
	private ArrayList<Product> products;

	// 생성자
	ProductExe() {
		products = new ArrayList<>();
		// 초기값
		products.add(new Product("P001", "볼펜", 1000));
		products.add(new Product("P002", "연필", 1200));
		products.add(new Product("N001", "노트100", 1000));
		products.add(new Product("N002", "다이어리", 3000));
	}

	// 메소드
	// 1.추가
	boolean addProduct(Product pro) {
		return products.add(pro);
	}

	// 2.목록반환
	ArrayList<Product> getProductList(){
		return products;
	}
	// 3.수정
	boolean modifyProduct(String code, int price) {
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getProductCode().equals(code)) {
				products.get(i).setPrice(price);
				return true;
			}
		}
		return false;
	}

}






//////////////////////////내가 한거








//package todo_p20231206;
//
//import java.util.ArrayList;
//
//public class ProductExe {
////상품기능
////상품등록/상품(가격)수정/상품목록
//	
//	private ArrayList<Product> products;
//	
//	ProductExe(){
//		products = new ArrayList<>();
//		products.add(new Product("P001", "볼펜", 1000));
//		products.add(new Product("P002", "연필", 1200));
//		products.add(new Product("N001", "노트", 1000));
//		products.add(new Product("N002", "다이어리", 3000));
//		
//	}
//	
//	//1. 상품등록
//	
//	boolean addProduct(Product prodprod) {
//		return products.add(prodprod);
//	}
//	
//	//2.목록
//	ArrayList<Product> getProdList(){
//		return products;
//	}
//	
//	//3.수정
//	boolean modifyProd(String code, int inputPrice) {
//		for(int i = 0; i<products.size(); i++) {
//			if(products.get(i) != null && products.get(i).getProdCode().equals(code)) {
//				
//				products.get(i).setPrice(inputPrice);
//				return true;
//			}
//		}
//		return false;
//		
//	}
//	
//
//}//end of class
