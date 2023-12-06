package 연습용;

import java.util.ArrayList;

public class ProductExe {
//상품기능
//상품등록/상품(가격)수정/상품목록
	
	private ArrayList<Product> products;
	
	ProductExe(){
		products = new ArrayList<>();
		products.add(new Product("P001", "볼펜", 1000));
		products.add(new Product("P002", "연필", 1200));
		products.add(new Product("N001", "노트", 1000));
		products.add(new Product("N002", "다이어리", 3000));
		
	}
	
	//1. 상품등록
	
	boolean addProduct(Product prodprod) {
		return products.add(prodprod);
	}
	
	//2.목록
	ArrayList<Product> getProdList(){
		return products;
	}
	
	//3.수정
	boolean modifyProd(String code, int inputPrice) {
		for(int i = 0; i<products.size(); i++) {
			if(products.get(i) != null && products.get(i).getProdCode().equals(code)) {
				
				products.get(i).setPrice(inputPrice);
				return true;
			}
		}
		return false;
		
	}
	

}//end of class
