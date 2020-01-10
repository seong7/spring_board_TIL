package com.bit.springBoard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.springBoard.command.BoardCommand;
import com.bit.springBoard.command.BoardContentViewCommand;
import com.bit.springBoard.command.BoardDeleteCommand;
import com.bit.springBoard.command.BoardListCommand;
import com.bit.springBoard.command.BoardModifyCommand;
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
		//System.out.println("write controller 호출");
		//System.out.println("req = " + req);
		model.addAttribute("request", req);
		command = new BoardWriteCommand();
		command.execute(model);
		return "redirect:list"; // client -> dispatcherServlet 에 요청 새로 보내 view 인 list.jsp 찾음
	}
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		command = new BoardListCommand();
		command.execute(model);
		return "list";//views/list.jsp 호출  ( list.jsp 에 필요한 처리를 이미 했으므로 redirect 할 필요 없음 )
	}
	
	@RequestMapping(value = "contentView")
	public String contentView(int bid, Model model) {
		model.addAttribute("bid", bid);
		command = new BoardContentViewCommand();
		command.execute(model);
		return "contentView";
	}
	
	@RequestMapping(value = "modify", method=RequestMethod.POST)  // POST는 선언을 해주어야 url 조작을 통한 GET 방식으로 해당 controller method 접근을 차단한다.
	public String modify(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BoardModifyCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping(value="delete")
	public String delete(int bid, Model model) {
		model.addAttribute("bid", bid);
		command = new BoardDeleteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
}
