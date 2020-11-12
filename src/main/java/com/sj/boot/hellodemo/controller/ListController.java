package com.sj.boot.hellodemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.boot.hellodemo.NameService;



@RestController
@RequestMapping(value="/names")
public class ListController {
	
	@Autowired
	NameService service;
	
	@RequestMapping(value="/players")
	public List getPlayers(Model model) {
		
		List <String> playerlist =service.getNames();
		model.addAttribute("players",playerlist);
		return playerlist;
	
	}
	
}
