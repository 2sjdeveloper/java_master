package com.yedam.reply.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.reply.vo.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> replyList(int boardNo);
	List<ReplyVO> replyListPaging(@Param("boardNo") int boardNo,  @Param("page") int page); //둘 다 값이 인트니까 파라메터 설정을 어쩌구.. 
	int deleteReply(int replyNo); 
	int insertReply(ReplyVO vo); //인서트 업데이트 딜리트는 타입을 인트로 해야됨.
	ReplyVO selectReply(int replyNo);
}
