package com.jsp.jasper.contact;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
	public List<Contact> getContactList(){
		List<Contact> listContact = new ArrayList<>();
		listContact.add(new Contact("Alin","alin@hengelo.nl","Nederland"));
		listContact.add(new Contact("John","john@hengelo.nl","Nederland"));
		listContact.add(new Contact("Peter","peter@deventer.nl","Nederland"));
		return listContact;
	}

}
