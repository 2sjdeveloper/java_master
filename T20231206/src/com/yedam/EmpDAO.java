package com.yedam;

import java.util.ArrayList;

public class EmpDAO {

	private ArrayList<Employee> employees;

	EmpDAO() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("23-01", "홍길동", "943-1234", "2023-10-01", 300));
		employees.add(new Employee("23-02", "김길동", "123-1234", "2023-10-02", 300));
		employees.add(new Employee("23-03", "박길동", "123-1413", "2023-10-03", 300));

	}

	// 1.등록

	boolean addEmp(Employee empemp) {
		return employees.add(empemp);
	}

	// 2.목록
	ArrayList<Employee> getEmpList() {
		return employees;
	}

	// 3.수정
	boolean modifyEmp(String code, int income) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i) != null && employees.get(i).getCode().equals(code)) {
				employees.get(i).setIncome(income);
				return true;
			}
		}
		return false;
	}

	// 4.삭제
	boolean removeEmp(String code) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i) != null && employees.get(i).getCode().equals(code)) {
				employees.remove(i);
				return true;
			}
		}
		return false;
	}

	// 5.조회(조건:입사일자)
	Employee getEmployee(String date) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i) != null && employees.get(i).getDate().equals(date)) {
				return employees.get(i);
			}
		}
		return null;
	}

}
