package chap_07.abstracts;

//추상 클래스 == abstract
public abstract class Animal {
	private String name;
	
	public Animal() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//추상메소드. 이걸 꼭 구현해줘야한다고 함.
	public abstract void sound();
	

}//end of class
