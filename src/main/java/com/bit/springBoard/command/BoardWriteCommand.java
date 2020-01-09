package com.bit.springBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;

public class BoardWriteCommand implements BoardCommand {

	@Override
	public void execute(Model model) {
		System.out.println(model);
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("request");
		String bName = req.getParameter("bname");
		String bTitle = req.getParameter("btitle");
		String bContent = req.getParameter("bcontent");
		System.out.println(bName);
		System.out.println(bTitle);
		System.out.println(bContent);
		BoardDao dao = new BoardDao();
		dao.write(bName, bTitle, bContent);
	}

}





