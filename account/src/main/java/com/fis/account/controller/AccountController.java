package com.fis.account.controller;
import org.springframework.web.bind.annotation.RestController;

import com.fis.account.bean.Account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@GetMapping("/{number}")
	public Account getaccount(@PathVariable long number){
		return new Account(987987973432l,"Savings",34234565);
		
	}
}

