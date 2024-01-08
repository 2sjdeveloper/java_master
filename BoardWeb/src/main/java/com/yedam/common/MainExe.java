package com.yedam.common;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.member.service.MemberService;
import com.yedam.member.serviceImpl.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;
import com.yedam.reply.service.ReplyService;
import com.yedam.reply.serviceImpl.ReplyServiceImpl;
import com.yedam.reply.vo.PageDTO;

public class MainExe { // 테스트용 클래스
	public static void main(String[] args) {
		ReplyService svc = new ReplyServiceImpl();
		List<HashMap<String, Object>> list = svc.chartData();
		Gson gson = new GsonBuilder().create();
		System.out.println(gson.toJson(list));

	}

}
