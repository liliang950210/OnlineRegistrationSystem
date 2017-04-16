package com.onlineRegister.model;

public class Page {
	
	private Integer pageNumber;
	private Integer pageSize;
	
	private Integer startPosition;

	
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(Integer startPosition) {
		this.startPosition = startPosition;
	}
	
	/**
	 * 计算其实位置，用page类之前必须调用
	 *@return
	 * @author：chuankun 1095409267@qq.com
	 * 2017年4月16日 下午5:05:16
	 */
	public Page getPage(){
		startPosition = (pageNumber -1)* pageSize;
		return this;
	}
}
