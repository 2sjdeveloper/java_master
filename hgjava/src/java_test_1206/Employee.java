package java_test_1206;

public class Employee {
	private String code;
	private String name;
	private String phone;
	private String date;
	private int income;

	Employee() {

	}

	public Employee(String code, String name, String phone, String date, int income) {
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.date = date;
		this.income = income;
	}

	void showInfo1() {
		System.out.println(code + " " + name + " " + phone + " " + date + " " + income);
	}

	void showInfo2() {
		System.out.println(code + " " + name + " " + date);
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getDate() {
		return date;
	}

	public int getIncome() {
		return income;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setIncome(int income) {
		this.income = income;
	}

}
