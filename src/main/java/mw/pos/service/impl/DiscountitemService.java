package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("discountitemService")
public class DiscountitemService implements IDiscountitemService {
	@Resource
	private DiscountitemMapper discountitemMapper;

	public int insert(Discountitem discountitem){
		return discountitemMapper.insert(discountitem);
	}
	public int insertSelective(Discountitem discountitem){
		return discountitemMapper.insertSelective(discountitem);
	}
	public int deleteByPrimaryKey(DiscountitemKey discountitemKey){
		return discountitemMapper.deleteByPrimaryKey(discountitemKey);
	}
	public Discountitem selectByPrimaryKey(DiscountitemKey discountitemKey){
		return discountitemMapper.selectByPrimaryKey(discountitemKey);
	}
	public int updateByPrimaryKeySelective(Discountitem discountitem){
		return discountitemMapper.updateByPrimaryKeySelective(discountitem);
	}
	public int updateByPrimaryKey(Discountitem discountitem){
		return discountitemMapper.updateByPrimaryKey(discountitem);
	}


}
