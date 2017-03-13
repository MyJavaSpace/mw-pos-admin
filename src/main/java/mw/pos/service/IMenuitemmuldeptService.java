package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemmuldeptService {
	int insert(menuitemmuldept menuitemmuldept);
	menuitemmuldept selectByPrimaryKey(menuitemmuldeptKey menuitemmuldeptKey);
	int updateByPrimaryKeySelective(menuitemmuldept menuitemmuldept);
	int deleteByPrimaryKey(menuitemmuldeptKey menuitemmuldeptKey);
	int updateByPrimaryKey(menuitemmuldept menuitemmuldept);
	int insertSelective(menuitemmuldept menuitemmuldept);

}
