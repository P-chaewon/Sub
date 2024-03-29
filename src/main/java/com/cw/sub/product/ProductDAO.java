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

	//카테고리별 품목 list
	public List<ProductDTO> getList(ProductDTO productDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList", productDTO);
	}
	
	//품목 상세 정보 보기
	public ProductDTO getSelect(ProductDTO productDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getSelect", productDTO);
	}
	
	//카테고리별 품목 갯수
	public Long getCount(ProductDTO productDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getCount", productDTO);
	}
}
