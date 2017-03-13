package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("discountService")
public class DiscountService implements IDiscountService {
	@Resource
	private discountMapper discountMapper;

	public int insert(discount discount){
		return discountMapper.insert(discount);
	}
	public int insertSelective(discount discount){
		return discountMapper.insertSelective(discount);
	}
	public discount selectByPrimaryKey(discountKey discountKey){
		return discountMapper.selectByPrimaryKey(discountKey);
	}
	public int deleteByPrimaryKey(discountKey discountKey){
		return discountMapper.deleteByPrimaryKey(discountKey);
	}
	public int updateByPrimaryKeySelective(discount discount){
		return discountMapper.updateByPrimaryKeySelective(discount);
	}
	public int updateByPrimaryKey(discount discount){
		return discountMapper.updateByPrimaryKey(discount);
	}


}
