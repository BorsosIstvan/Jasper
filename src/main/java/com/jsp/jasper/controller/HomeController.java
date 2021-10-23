package com.jsp.jasper.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.jasper.contact.Contact;
import com.jsp.jasper.contact.ContactBusiness;




@Controller
public class HomeController {
	@RequestMapping("/list_contacts")
	public String listPersons(Model model) {
		List<Contact> contactList = new ContactBusiness().getContactList();
		model.addAttribute("contacts",contactList);
		return "contact";
	}
	

}
