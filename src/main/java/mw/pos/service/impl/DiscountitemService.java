package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("DiscountitemService")
public class DiscountitemService implements IDiscountitemService {
	@Resource
	private DiscountitemMapper DiscountitemMapper;

	public int insert(Discountitem discountitem){
		return DiscountitemMapper.insert(discountitem);
	}
	public int insertSelective(Discountitem discountitem){
		return DiscountitemMapper.insertSelective(discountitem);
	}
	public int deleteByPrimaryKey(DiscountitemKey discountitemKey){
		return DiscountitemMapper.deleteByPrimaryKey(discountitemKey);
	}
	public Discountitem selectByPrimaryKey(DiscountitemKey discountitemKey){
		return DiscountitemMapper.selectByPrimaryKey(discountitemKey);
	}
	public int updateByPrimaryKey(Discountitem discountitem){
		return DiscountitemMapper.updateByPrimaryKey(discountitem);
	}
	public int updateByPrimaryKeySelective(Discountitem discountitem){
		return DiscountitemMapper.updateByPrimaryKeySelective(discountitem);
	}


}
