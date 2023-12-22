package com.yedam.student.mapper;

import java.util.List;

import com.yedam.student.vo.Student;

public interface StudentMapper {
	// CRUD (목록, 추가, 수정, 삭제)
	List<Student> studentList();
	int addStudent(Student std); //xml에 #{stuNo} 이 형식으로 필드를 넣어줬음.
	int remStudent(String sno); //#{sno}

}
