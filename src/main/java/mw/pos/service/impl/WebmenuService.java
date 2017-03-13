package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("webmenuService")
public class WebmenuService implements IWebmenuService {
	@Resource
	private WebmenuMapper webmenuMapper;

	public int insert(Webmenu webmenu){
		return webmenuMapper.insert(webmenu);
	}
	public int insertSelective(Webmenu webmenu){
		return webmenuMapper.insertSelective(webmenu);
	}
	public int deleteByPrimaryKey(Integer integer){
		return webmenuMapper.deleteByPrimaryKey(integer);
	}
	public Webmenu selectByPrimaryKey(Integer integer){
		return webmenuMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Webmenu webmenu){
		return webmenuMapper.updateByPrimaryKeySelective(webmenu);
	}
	public int updateByPrimaryKey(Webmenu webmenu){
		return webmenuMapper.updateByPrimaryKey(webmenu);
	}


}
