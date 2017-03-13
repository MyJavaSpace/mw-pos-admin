package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("discountitemService")
public class DiscountitemService implements IDiscountitemService {
	@Resource
	private discountitemMapper discountitemMapper;

	public int insert(discountitem discountitem){
		return discountitemMapper.insert(discountitem);
	}
	public int insertSelective(discountitem discountitem){
		return discountitemMapper.insertSelective(discountitem);
	}
	public discountitem selectByPrimaryKey(discountitemKey discountitemKey){
		return discountitemMapper.selectByPrimaryKey(discountitemKey);
	}
	public int deleteByPrimaryKey(discountitemKey discountitemKey){
		return discountitemMapper.deleteByPrimaryKey(discountitemKey);
	}
	public int updateByPrimaryKeySelective(discountitem discountitem){
		return discountitemMapper.updateByPrimaryKeySelective(discountitem);
	}
	public int updateByPrimaryKey(discountitem discountitem){
		return discountitemMapper.updateByPrimaryKey(discountitem);
	}


}
