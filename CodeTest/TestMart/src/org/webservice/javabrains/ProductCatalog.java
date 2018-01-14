package org.webservice.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.webservice.javabrains.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	ProductServiceImpl  productService = new ProductServiceImpl();
	@WebMethod
	public List<String> getProductCategories() {
		return productService.getProductCategories();

	}
public List<String>getProducts(){
	return productService.getProducts(null);
}
}
