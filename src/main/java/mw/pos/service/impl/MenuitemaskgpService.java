package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemaskgpService")
public class MenuitemaskgpService implements IMenuitemaskgpService {
	@Resource
	private MenuitemaskgpMapper menuitemaskgpMapper;

	public int insert(Menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.insert(menuitemaskgp);
	}
	public int insertSelective(Menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.insertSelective(menuitemaskgp);
	}
	public int deleteByPrimaryKey(MenuitemaskgpKey menuitemaskgpKey){
		return menuitemaskgpMapper.deleteByPrimaryKey(menuitemaskgpKey);
	}
	public Menuitemaskgp selectByPrimaryKey(MenuitemaskgpKey menuitemaskgpKey){
		return menuitemaskgpMapper.selectByPrimaryKey(menuitemaskgpKey);
	}
	public int updateByPrimaryKeySelective(Menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.updateByPrimaryKeySelective(menuitemaskgp);
	}
	public int updateByPrimaryKey(Menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.updateByPrimaryKey(menuitemaskgp);
	}


}
