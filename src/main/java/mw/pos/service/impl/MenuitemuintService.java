package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("menuitemuintService")
public class MenuitemuintService implements IMenuitemuintService {
	@Resource
	private menuitemuintMapper menuitemuintMapper;

	public int insert(menuitemuint menuitemuint){
		return menuitemuintMapper.insert(menuitemuint);
	}
	public int insertSelective(menuitemuint menuitemuint){
		return menuitemuintMapper.insertSelective(menuitemuint);
	}
	public menuitemuint selectByPrimaryKey(Integer integer){
		return menuitemuintMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return menuitemuintMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(menuitemuint menuitemuint){
		return menuitemuintMapper.updateByPrimaryKeySelective(menuitemuint);
	}
	public int updateByPrimaryKey(menuitemuint menuitemuint){
		return menuitemuintMapper.updateByPrimaryKey(menuitemuint);
	}


}
