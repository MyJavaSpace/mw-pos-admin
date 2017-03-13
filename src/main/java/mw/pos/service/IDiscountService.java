package mw.pos.service;

import com.pos.entity.*;

public interface IDiscountService {
	int insert(Discount discount);
	int deleteByPrimaryKey(DiscountKey discountKey);
	int updateByPrimaryKey(Discount discount);
	Discount selectByPrimaryKey(DiscountKey discountKey);
	int insertSelective(Discount discount);
	int updateByPrimaryKeySelective(Discount discount);

}
