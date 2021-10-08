package com.cw.sub.util;

import org.springframework.stereotype.Component;

@Component
public class Pager {
	
	//검색
	private String search;

	private Long pn;
	private Long perPage;
	private Long totalPage;
	private Long startRow;
	private Long lastRow;
	private Long perBlock;
	private Long startNum;
	private Long lastNum;
	
	//한 페이지 안에 들어가는 첫 글의 번호와 마지막 글의 번호
	public void makeRow(){
		this.startRow = this.getPerPage()*(this.getPn()-1)+1;
		this.lastRow = this.getPerPage()*this.getPn();
	}
	//한 페이지 안에 들어가는 블록 그룹의 시작 번호, 마지막 번호 구하기
	public void makeNum(Long totalCount) {
		//전체 페이지 수 = 전체 게시글 수 / 한 페이지 당 글 수
		this.totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!= 0) {
			this.totalPage++;
		}
		//전체 블록그룹 수 = 전체 페이지 수 / 한 페이지 당 블록 수
		Long totalBlock = this.totalPage/this.getPerBlock();
		if(this.totalPage%this.getPerBlock() != 0) {
			totalBlock++;
		}
		//전체 페이지 수가 page number보다 적을 경우 page number=전체 페이지 수
		if(this.totalPage<this.getPn()) {
			this.setPn(totalPage);
		}
		//현재 위치해 있는 블록 그룹의 번호
		Long curBlock = this.getPn()/this.getPerBlock();
		if(this.getPn()%this.getPerBlock()!=0) {
			curBlock++;
		}
		this.startNum = this.getPerBlock()*(curBlock-1)+1;
		this.lastNum = this.getPerBlock()*curBlock;
		
		//현재 위치해 있는 블록 그룹이 마지막 그룹일 때 블록의 마지막 번호는 전체 페이지 수의 번호
		if(totalBlock==curBlock) {
			this.lastNum = this.totalPage;
		}
		
	}
	
	
	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	public Long getPn() {
		if(this.pn==null || this.pn<=0) {
			this.pn=1L;
		}
		return pn;
	}
	public void setPn(Long pn) {
		this.pn = pn;
	}
	public Long getPerPage() {
		if(this.perPage==null||this.perPage==0) {
			this.perPage=5L;
		}
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getPerBlock() {
		if(this.perBlock==null||this.perBlock==0) {
			this.perBlock=10L;
		}
		return perBlock;
	}
	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	
}
