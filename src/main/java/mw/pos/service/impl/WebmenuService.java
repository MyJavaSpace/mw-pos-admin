package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("WebmenuService")
public class WebmenuService implements IWebmenuService {
	@Resource
	private WebmenuMapper WebmenuMapper;

	public int insert(Webmenu webmenu){
		return WebmenuMapper.insert(webmenu);
	}
	public int insertSelective(Webmenu webmenu){
		return WebmenuMapper.insertSelective(webmenu);
	}
	public int deleteByPrimaryKey(Integer integer){
		return WebmenuMapper.deleteByPrimaryKey(integer);
	}
	public Webmenu selectByPrimaryKey(Integer integer){
		return WebmenuMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Webmenu webmenu){
		return WebmenuMapper.updateByPrimaryKey(webmenu);
	}
	public int updateByPrimaryKeySelective(Webmenu webmenu){
		return WebmenuMapper.updateByPrimaryKeySelective(webmenu);
	}


}
