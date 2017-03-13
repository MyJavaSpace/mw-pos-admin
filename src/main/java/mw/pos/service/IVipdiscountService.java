package mw.pos.service;

import com.pos.entity.*;

public interface IVipdiscountService {
	int insert(Vipdiscount vipdiscount);
	int deleteByPrimaryKey(VipdiscountKey vipdiscountKey);
	int updateByPrimaryKey(Vipdiscount vipdiscount);
	Vipdiscount selectByPrimaryKey(VipdiscountKey vipdiscountKey);
	int insertSelective(Vipdiscount vipdiscount);
	int updateByPrimaryKeySelective(Vipdiscount vipdiscount);

}
