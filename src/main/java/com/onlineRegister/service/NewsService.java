package com.onlineRegister.service;

import java.util.List;

import com.onlineRegister.model.News;

public interface NewsService {
	
	public void addNews(News news);
	
	public void updateNews(News news);
	
	public void deleteNews(Long id);
	
	public List<News> findAll();

}
