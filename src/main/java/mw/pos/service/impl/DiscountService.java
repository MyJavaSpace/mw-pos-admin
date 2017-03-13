package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("discountService")
public class DiscountService implements IDiscountService {
	@Resource
	private DiscountMapper discountMapper;

	public int insert(Discount discount){
		return discountMapper.insert(discount);
	}
	public int insertSelective(Discount discount){
		return discountMapper.insertSelective(discount);
	}
	public int deleteByPrimaryKey(DiscountKey discountKey){
		return discountMapper.deleteByPrimaryKey(discountKey);
	}
	public Discount selectByPrimaryKey(DiscountKey discountKey){
		return discountMapper.selectByPrimaryKey(discountKey);
	}
	public int updateByPrimaryKeySelective(Discount discount){
		return discountMapper.updateByPrimaryKeySelective(discount);
	}
	public int updateByPrimaryKey(Discount discount){
		return discountMapper.updateByPrimaryKey(discount);
	}


}
