package com.cw.sub.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.cw.sub.product.ProductDAO.";
	
	public List<ProductDTO> getAllList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"getAllList");
	}

	public List<ProductDTO> getList(ProductDTO productDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", productDTO);
	}
	
	public ProductDTO getSelect(ProductDTO productDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getSelect", productDTO);
	}
	
	public Long getCount(ProductDTO productDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getCount", productDTO);
	}
}
