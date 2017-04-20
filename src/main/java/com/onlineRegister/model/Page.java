package com.onlineRegister.model;

public class Page {
	
	private Integer page;
	private Integer rows;
	
	private Integer startPosition;

	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(Integer startPosition) {
		this.startPosition = startPosition;
	}
	
	/**
	 * 璁＄畻鍏跺疄浣嶇疆锛岀敤page绫讳箣鍓嶅繀椤昏皟鐢�
	 *@return
	 * @author锛歝huankun 1095409267@qq.com
	 * 2017骞�4鏈�16鏃� 涓嬪崍5:05:16
	 */
	public Page getPage(){
		startPosition = (page -1)* rows;
		return this;
	}
	
}
