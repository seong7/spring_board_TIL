package com.bit.springBoard.command;

import org.springframework.ui.Model;

public interface BoardCommand{
	public void execute(Model model);
}
