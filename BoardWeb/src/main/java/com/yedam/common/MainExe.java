package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.vo.BoardVO;

public class MainExe {
	public static void main(String[] args) {

		SqlSessionFactory factory = DataSource.getInstance();
		SqlSession session = factory.openSession(true);

		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO vo = new BoardVO();
		vo.setTitle("지금 수정중");
		vo.setContent("수정합시다?");
		vo.setWriter("수정중이요~");
		vo.setBoardNo(4);		
		mapper.updateBoard(vo);
		
		if(mapper.updateBoard(vo) == 1) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		
		
		
		
		
		
//		목록
//		List<BoardVO> list = mapper.selectList();
//		for (BoardVO vo : list) {
//			System.out.println(vo.toString());
//		}

		
//		추가
//		BoardMapper mapper = session.getMapper(BoardMapper.class);
//		BoardVO vo = new BoardVO();
//		vo.setTitle("새로운 글을 작성했어요");
//		vo.setContent("작성이 됐나요");
//		vo.setWriter("이작성");
//		mapper.insertBoard(vo);	
		

//      단건조회
//		BoardMapper mapper = session.getMapper(BoardMapper.class);
//		BoardVO vo = new BoardVO();
//		vo.setBoardNo(4);		
//		vo = mapper.selectOne(2);
//		System.out.println(vo);
		
		

//		수정
//		BoardMapper mapper = session.getMapper(BoardMapper.class);
//		BoardVO vo = new BoardVO();
//		vo.setTitle("tttttttt");
//		vo.setContent("sdsdsc");
//		vo.setWriter("wwwww");
//		vo.setBoardNo(4);		
//		mapper.updateBoard(vo);
		
		
		
//		삭제
//		BoardMapper mapper = session.getMapper(BoardMapper.class);
//		BoardVO vo = new BoardVO();
//		vo.setBoardNo(4);
//		mapper.deleteBoard(4);
		
		
		
		
//		조회수 증가
//		if(mapper.updateCnt(2) == 1) {
//			System.out.println("조회수 증가 성공");
//		}else {
//			System.out.println("조회수 증가 실패");
//		}
	
	
	}

}
