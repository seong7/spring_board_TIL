package com.bit.springBoard.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;
import com.bit.springBoard.dto.BoardDto;

public class BoardListCommand implements BoardCommand {

	@Override
	public void execute(Model model) {
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> dtos = dao.list();
		model.addAttribute("list", dtos);
	}

}





