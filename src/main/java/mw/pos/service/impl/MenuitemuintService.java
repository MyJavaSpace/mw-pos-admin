package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemuintService")
public class MenuitemuintService implements IMenuitemuintService {
	@Resource
	private MenuitemuintMapper menuitemuintMapper;

	public int insert(Menuitemuint menuitemuint){
		return menuitemuintMapper.insert(menuitemuint);
	}
	public int insertSelective(Menuitemuint menuitemuint){
		return menuitemuintMapper.insertSelective(menuitemuint);
	}
	public int deleteByPrimaryKey(Integer integer){
		return menuitemuintMapper.deleteByPrimaryKey(integer);
	}
	public Menuitemuint selectByPrimaryKey(Integer integer){
		return menuitemuintMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Menuitemuint menuitemuint){
		return menuitemuintMapper.updateByPrimaryKeySelective(menuitemuint);
	}
	public int updateByPrimaryKey(Menuitemuint menuitemuint){
		return menuitemuintMapper.updateByPrimaryKey(menuitemuint);
	}


}
