package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("WebmenugroupService")
public class WebmenugroupService implements IWebmenugroupService {
	@Resource
	private WebmenugroupMapper WebmenugroupMapper;

	public int insert(Webmenugroup webmenugroup){
		return WebmenugroupMapper.insert(webmenugroup);
	}
	public int insertSelective(Webmenugroup webmenugroup){
		return WebmenugroupMapper.insertSelective(webmenugroup);
	}
	public int deleteByPrimaryKey(Integer integer){
		return WebmenugroupMapper.deleteByPrimaryKey(integer);
	}
	public Webmenugroup selectByPrimaryKey(Integer integer){
		return WebmenugroupMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Webmenugroup webmenugroup){
		return WebmenugroupMapper.updateByPrimaryKey(webmenugroup);
	}
	public int updateByPrimaryKeySelective(Webmenugroup webmenugroup){
		return WebmenugroupMapper.updateByPrimaryKeySelective(webmenugroup);
	}


}
