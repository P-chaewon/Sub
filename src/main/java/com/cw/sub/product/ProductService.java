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

	public List<ProductDTO> getList(ProductDTO productDTO, Pager pager) throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("product", productDTO);
		map.put("pager", pager);
		Long totalCount = productDAO.getCount(map);
		pager.makeNum(totalCount);
		pager.makeRow();
		
		return productDAO.getList(map);
	}
	
	public ProductDTO getSelect(ProductDTO productDTO) throws Exception{
		return productDAO.getSelect(productDTO);
	}
}
