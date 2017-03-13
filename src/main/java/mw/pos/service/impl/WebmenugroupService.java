package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("webmenugroupService")
public class WebmenugroupService implements IWebmenugroupService {
	@Resource
	private WebmenugroupMapper webmenugroupMapper;

	public int insert(Webmenugroup webmenugroup){
		return webmenugroupMapper.insert(webmenugroup);
	}
	public int insertSelective(Webmenugroup webmenugroup){
		return webmenugroupMapper.insertSelective(webmenugroup);
	}
	public int deleteByPrimaryKey(Integer integer){
		return webmenugroupMapper.deleteByPrimaryKey(integer);
	}
	public Webmenugroup selectByPrimaryKey(Integer integer){
		return webmenugroupMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Webmenugroup webmenugroup){
		return webmenugroupMapper.updateByPrimaryKeySelective(webmenugroup);
	}
	public int updateByPrimaryKey(Webmenugroup webmenugroup){
		return webmenugroupMapper.updateByPrimaryKey(webmenugroup);
	}


}
