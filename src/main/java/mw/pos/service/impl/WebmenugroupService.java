package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("webmenugroupService")
public class WebmenugroupService implements IWebmenugroupService {
	@Resource
	private webmenugroupMapper webmenugroupMapper;

	public int insert(webmenugroup webmenugroup){
		return webmenugroupMapper.insert(webmenugroup);
	}
	public int insertSelective(webmenugroup webmenugroup){
		return webmenugroupMapper.insertSelective(webmenugroup);
	}
	public webmenugroup selectByPrimaryKey(Integer integer){
		return webmenugroupMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return webmenugroupMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(webmenugroup webmenugroup){
		return webmenugroupMapper.updateByPrimaryKeySelective(webmenugroup);
	}
	public int updateByPrimaryKey(webmenugroup webmenugroup){
		return webmenugroupMapper.updateByPrimaryKey(webmenugroup);
	}


}
