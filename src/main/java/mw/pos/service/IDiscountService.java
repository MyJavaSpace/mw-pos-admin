package mw.pos.service;

import com.pos.entity.*;

public interface IDiscountService {
	int insert(discount discount);
	discount selectByPrimaryKey(discountKey discountKey);
	int updateByPrimaryKeySelective(discount discount);
	int deleteByPrimaryKey(discountKey discountKey);
	int updateByPrimaryKey(discount discount);
	int insertSelective(discount discount);

}
