package com.yedam.student.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DataSource;
import com.yedam.student.mapper.StudentMapper;
import com.yedam.student.service.StudentService;
import com.yedam.student.vo.Student;

public class StudentServiceMybatis implements StudentService {
	// DB를 jdbc가 아니라 mybatis로 처리. 두개를 비교해보기.
	SqlSessionFactory factory = DataSource.getInstance();
	SqlSession session = factory.openSession(true);

	StudentMapper mapper = session.getMapper(StudentMapper.class);

	@Override
	public List<Student> studentList() {
		return mapper.studentList();
	}

	@Override
	public boolean addStudent(Student std) {
		return mapper.addStudent(std) == 1;
	}

	@Override
	public boolean modStudent(String sno, int escore, int mscore) {
		return false;
	}

	@Override
	public boolean remStudent(String sno) {
		return mapper.remStudent(sno) == 1;
	}

	@Override
	public Student getStudent(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

}
