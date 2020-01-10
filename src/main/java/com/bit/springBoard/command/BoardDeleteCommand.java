package com.bit.springBoard.command;

import java.util.Map;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;

public class BoardDeleteCommand implements BoardCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		int bid = (int)map.get("bid");
		BoardDao dao = new BoardDao();
		dao.delete(bid);
	}
}
