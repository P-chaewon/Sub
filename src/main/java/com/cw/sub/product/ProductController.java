package com.cw.sub.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	public ModelAndView getList(ProductDTO productDTO, Pager pager, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.getList(productDTO, pager);
		String para ="";
		String category="";
		if(request.getParameter("c1")!=null) {
			category = "c1";
			para = productDTO.getC1();
		} else if(request.getParameter("c2")!= null) {
			category = "c2";
			para = productDTO.getC2();
		} else {
			category = "c3";
			para = productDTO.getC3();
		}
		System.out.println(para);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.addObject("category", category);
		mv.addObject("para", para);
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
