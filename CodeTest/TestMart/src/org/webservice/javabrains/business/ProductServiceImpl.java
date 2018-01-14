package org.webservice.javabrains.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();

	public ProductServiceImpl() {
		bookList.add("Chetan Bhagath");
		bookList.add("The Game Of Thrones");
		bookList.add("inferno");

		musicList.add("Ilayaraja Albums");
		musicList.add("Shreya Goshal Albums");
		musicList.add("DSP Albums");

		movieList.add("Prabhas Movies");
		movieList.add("Pawan Kalyan Movies");
		movieList.add("VEnkatesh Movies");

	}

	public List<String> getProductCategories() {

		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;

	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;

		case "music":
			return musicList;

		case "movies":
			return movieList;

		}
			return null ;
		
	}
}
