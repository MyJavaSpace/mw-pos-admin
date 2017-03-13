package mw.pos.service;

import com.pos.entity.*;

public interface IVipdiscountService {
	int insert(vipdiscount vipdiscount);
	vipdiscount selectByPrimaryKey(vipdiscountKey vipdiscountKey);
	int updateByPrimaryKeySelective(vipdiscount vipdiscount);
	int deleteByPrimaryKey(vipdiscountKey vipdiscountKey);
	int updateByPrimaryKey(vipdiscount vipdiscount);
	int insertSelective(vipdiscount vipdiscount);

}
