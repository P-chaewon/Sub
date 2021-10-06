package com.cw.sub.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cw.sub.util.Pager;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("productList")
	public ModelAndView getList(ProductDTO productDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.getList(productDTO);
		mv.addObject("list", ar);
		mv.setViewName("product/list");
		return mv;
	}
	
	@GetMapping("productView")
	public ModelAndView getSelect(ProductDTO productDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		productDTO = productService.getSelect(productDTO);
		mv.addObject("dto", productDTO);
		mv.setViewName("product/select");
		return mv;
	}

}
