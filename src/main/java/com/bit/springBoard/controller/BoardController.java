package com.bit.springBoard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.springBoard.command.BoardCommand;
import com.bit.springBoard.command.BoardListCommand;
import com.bit.springBoard.command.BoardWriteCommand;

@Controller
public class BoardController {
	
	BoardCommand command;
	
	@RequestMapping(value = "writeView")
	public String writeView() {
		return "writeView";//views/writeView.jsp 호출
	}
	
	@RequestMapping(value = "write")
	public String write(HttpServletRequest req, Model model) {
		System.out.println("write controller 호출");
		System.out.println("req = " + req);
		model.addAttribute("request", req);
		command = new BoardWriteCommand();
		command.execute(model);
		return "redirect:list";//views/writeView.jsp 호출
	}
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		command = new BoardListCommand();
		command.execute(model);
		return "list";//views/list.jsp 호출
	}
}
