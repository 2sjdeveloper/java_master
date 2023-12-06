package 연습용;

import lombok.Data;

//상품코드/상품명/가격
//P001 볼펜 1000
//P002 연필 1200
//N001 노트 1000
//N002 다이어리 3000

@Data
public class Product { // 상품의 정보 저장

	private String prodCode;
	private String prodName;
	private int price;

	Product(){
	}
		
	public Product(String proCode, String prodName, int price) {
		this.prodCode = proCode;
		this.prodName = prodName;
		this.price = price;
			
	}
	void showInfo() {
		System.out.println(prodCode + " " + prodName + " " + price);
	}
		
		


}// end of class
