package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuitemaskgpService")
public class MenuitemaskgpService implements IMenuitemaskgpService {
	@Resource
	private MenuitemaskgpMapper MenuitemaskgpMapper;

	public int insert(Menuitemaskgp menuitemaskgp){
		return MenuitemaskgpMapper.insert(menuitemaskgp);
	}
	public int insertSelective(Menuitemaskgp menuitemaskgp){
		return MenuitemaskgpMapper.insertSelective(menuitemaskgp);
	}
	public int deleteByPrimaryKey(MenuitemaskgpKey menuitemaskgpKey){
		return MenuitemaskgpMapper.deleteByPrimaryKey(menuitemaskgpKey);
	}
	public Menuitemaskgp selectByPrimaryKey(MenuitemaskgpKey menuitemaskgpKey){
		return MenuitemaskgpMapper.selectByPrimaryKey(menuitemaskgpKey);
	}
	public int updateByPrimaryKey(Menuitemaskgp menuitemaskgp){
		return MenuitemaskgpMapper.updateByPrimaryKey(menuitemaskgp);
	}
	public int updateByPrimaryKeySelective(Menuitemaskgp menuitemaskgp){
		return MenuitemaskgpMapper.updateByPrimaryKeySelective(menuitemaskgp);
	}


}
