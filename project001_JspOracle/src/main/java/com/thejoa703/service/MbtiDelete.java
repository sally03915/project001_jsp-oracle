package com.thejoa703.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thejoa703.dao.PostDao;
import com.thejoa703.dto.PostDto;

public class MbtiDelete implements MbtiService {
	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 데이터 넘겨받기 
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String pass = request.getParameter("pass");
		
		//2. 드커프리
		  PostDao dao = new PostDao(); 
		  PostDto dto = new PostDto(); 
		  dto.setPass(pass);
		  dto.setId(id);
		
		//3. 데이터 넘기기
		  request.setAttribute("result", String.valueOf( dao.delete(dto) ));
	}
}
