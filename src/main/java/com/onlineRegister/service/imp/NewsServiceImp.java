package com.onlineRegister.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onlineRegister.dao.NewsMapper;
import com.onlineRegister.model.News;
import com.onlineRegister.service.NewsService;

/**
 * 
 * @author:chuankun 1095409267@qq.com
 * 2017年4月16日 下午8:47:54
 */
@Service
public class NewsServiceImp implements NewsService{
	
	
	@Resource
	private NewsMapper newsMapper;

	public void addNews(News news) {
		// TODO Auto-generated method stub
		newsMapper.insertSelective(news);
	}

	public void updateNews(News news) {
		// TODO Auto-generated method stub
		newsMapper.updateByPrimaryKeySelective(news);
	}

	public void deleteNews(Long id) {
		// TODO Auto-generated method stub
		News news = newsMapper.selectByPrimaryKey(id);
		news.setIsShow(1);
		newsMapper.updateByPrimaryKeySelective(news);
	}

	public List<News> findAll() {
		// TODO Auto-generated method stub
		return newsMapper.selectAll();
	}

}
