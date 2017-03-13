package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuingredgprelService")
public class MenuingredgprelService implements IMenuingredgprelService {
	@Resource
	private menuingredgprelMapper menuingredgprelMapper;

	public int insert(menuingredgprel menuingredgprel){
		return menuingredgprelMapper.insert(menuingredgprel);
	}
	public int insertSelective(menuingredgprel menuingredgprel){
		return menuingredgprelMapper.insertSelective(menuingredgprel);
	}
	public menuingredgprel selectByPrimaryKey(menuingredgprelKey menuingredgprelKey){
		return menuingredgprelMapper.selectByPrimaryKey(menuingredgprelKey);
	}
	public int deleteByPrimaryKey(menuingredgprelKey menuingredgprelKey){
		return menuingredgprelMapper.deleteByPrimaryKey(menuingredgprelKey);
	}
	public int updateByPrimaryKeySelective(menuingredgprel menuingredgprel){
		return menuingredgprelMapper.updateByPrimaryKeySelective(menuingredgprel);
	}
	public int updateByPrimaryKey(menuingredgprel menuingredgprel){
		return menuingredgprelMapper.updateByPrimaryKey(menuingredgprel);
	}


}
