package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("webmenuService")
public class WebmenuService implements IWebmenuService {
	@Resource
	private webmenuMapper webmenuMapper;

	public int insert(webmenu webmenu){
		return webmenuMapper.insert(webmenu);
	}
	public int insertSelective(webmenu webmenu){
		return webmenuMapper.insertSelective(webmenu);
	}
	public webmenu selectByPrimaryKey(Integer integer){
		return webmenuMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return webmenuMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(webmenu webmenu){
		return webmenuMapper.updateByPrimaryKeySelective(webmenu);
	}
	public int updateByPrimaryKey(webmenu webmenu){
		return webmenuMapper.updateByPrimaryKey(webmenu);
	}


}
