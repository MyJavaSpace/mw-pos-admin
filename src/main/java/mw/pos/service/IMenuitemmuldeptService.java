package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemmuldeptService {
	int insert(Menuitemmuldept menuitemmuldept);
	int deleteByPrimaryKey(MenuitemmuldeptKey menuitemmuldeptKey);
	int updateByPrimaryKey(Menuitemmuldept menuitemmuldept);
	Menuitemmuldept selectByPrimaryKey(MenuitemmuldeptKey menuitemmuldeptKey);
	int insertSelective(Menuitemmuldept menuitemmuldept);
	int updateByPrimaryKeySelective(Menuitemmuldept menuitemmuldept);

}
