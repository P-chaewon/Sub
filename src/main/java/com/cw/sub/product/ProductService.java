package com.cw.sub.product;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.sub.util.Pager;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public List<ProductDTO> getAllList() throws Exception {
		return productDAO.getAllList();
	}

	public List<ProductDTO> getList(ProductDTO productDTO) throws Exception{
		return productDAO.getList(productDTO);
	}
	
	public ProductDTO getSelect(ProductDTO productDTO) throws Exception{
		return productDAO.getSelect(productDTO);
	}
}
