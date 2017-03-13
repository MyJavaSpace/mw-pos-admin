package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("DiscountService")
public class DiscountService implements IDiscountService {
	@Resource
	private DiscountMapper DiscountMapper;

	public int insert(Discount discount){
		return DiscountMapper.insert(discount);
	}
	public int insertSelective(Discount discount){
		return DiscountMapper.insertSelective(discount);
	}
	public int deleteByPrimaryKey(DiscountKey discountKey){
		return DiscountMapper.deleteByPrimaryKey(discountKey);
	}
	public Discount selectByPrimaryKey(DiscountKey discountKey){
		return DiscountMapper.selectByPrimaryKey(discountKey);
	}
	public int updateByPrimaryKey(Discount discount){
		return DiscountMapper.updateByPrimaryKey(discount);
	}
	public int updateByPrimaryKeySelective(Discount discount){
		return DiscountMapper.updateByPrimaryKeySelective(discount);
	}


}
