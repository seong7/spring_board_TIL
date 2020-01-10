package com.bit.springBoard.command;

import java.util.Map;


import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;
import com.bit.springBoard.dto.BoardDto;

public class BoardContentViewCommand implements BoardCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		int bid = (int)map.get("bid");
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.contentView(bid);
		
		model.addAttribute("contentView", dto);
	}

}





