package mw.pos.service;

import com.pos.entity.*;

public interface IDiscountitemService {
	int insert(Discountitem discountitem);
	int deleteByPrimaryKey(DiscountitemKey discountitemKey);
	int updateByPrimaryKey(Discountitem discountitem);
	Discountitem selectByPrimaryKey(DiscountitemKey discountitemKey);
	int insertSelective(Discountitem discountitem);
	int updateByPrimaryKeySelective(Discountitem discountitem);

}
