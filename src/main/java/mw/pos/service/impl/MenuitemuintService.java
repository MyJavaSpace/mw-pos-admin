package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MenuitemuintService")
public class MenuitemuintService implements IMenuitemuintService {
	@Resource
	private MenuitemuintMapper MenuitemuintMapper;

	public int insert(Menuitemuint menuitemuint){
		return MenuitemuintMapper.insert(menuitemuint);
	}
	public int insertSelective(Menuitemuint menuitemuint){
		return MenuitemuintMapper.insertSelective(menuitemuint);
	}
	public int deleteByPrimaryKey(Integer integer){
		return MenuitemuintMapper.deleteByPrimaryKey(integer);
	}
	public Menuitemuint selectByPrimaryKey(Integer integer){
		return MenuitemuintMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Menuitemuint menuitemuint){
		return MenuitemuintMapper.updateByPrimaryKey(menuitemuint);
	}
	public int updateByPrimaryKeySelective(Menuitemuint menuitemuint){
		return MenuitemuintMapper.updateByPrimaryKeySelective(menuitemuint);
	}


}
