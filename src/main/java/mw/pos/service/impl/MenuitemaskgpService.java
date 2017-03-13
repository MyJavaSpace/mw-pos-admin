package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemaskgpService")
public class MenuitemaskgpService implements IMenuitemaskgpService {
	@Resource
	private menuitemaskgpMapper menuitemaskgpMapper;

	public int insert(menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.insert(menuitemaskgp);
	}
	public int insertSelective(menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.insertSelective(menuitemaskgp);
	}
	public menuitemaskgp selectByPrimaryKey(menuitemaskgpKey menuitemaskgpKey){
		return menuitemaskgpMapper.selectByPrimaryKey(menuitemaskgpKey);
	}
	public int deleteByPrimaryKey(menuitemaskgpKey menuitemaskgpKey){
		return menuitemaskgpMapper.deleteByPrimaryKey(menuitemaskgpKey);
	}
	public int updateByPrimaryKeySelective(menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.updateByPrimaryKeySelective(menuitemaskgp);
	}
	public int updateByPrimaryKey(menuitemaskgp menuitemaskgp){
		return menuitemaskgpMapper.updateByPrimaryKey(menuitemaskgp);
	}


}
