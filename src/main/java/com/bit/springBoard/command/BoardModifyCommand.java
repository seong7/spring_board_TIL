package com.bit.springBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;

public class BoardModifyCommand implements BoardCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("request");
		String bname = req.getParameter("bname");
		String btitle = req.getParameter("btitle");
		String bcontent = req.getParameter("bcontent");
		int bid = Integer.parseInt(req.getParameter("bid"));
		BoardDao dao = new BoardDao();
		dao.modify(bid, bname, btitle, bcontent);
	}
	
}
