package com.demo.service;

import com.demo.model.Library;

public class LibraryServiceImpl implements LibraryService {

	public Library getLibraryList() {
		String query = "Select * from Library";

		return null;
	}

	public int getQuanityAvailable() {
		String query = "Select quantity from Library where bookId= {}";
		return 0;
	}

}
