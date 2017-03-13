package mw.pos.service;

import com.pos.entity.*;

public interface IDiscountitemService {
	int insert(discountitem discountitem);
	discountitem selectByPrimaryKey(discountitemKey discountitemKey);
	int updateByPrimaryKeySelective(discountitem discountitem);
	int deleteByPrimaryKey(discountitemKey discountitemKey);
	int updateByPrimaryKey(discountitem discountitem);
	int insertSelective(discountitem discountitem);

}
