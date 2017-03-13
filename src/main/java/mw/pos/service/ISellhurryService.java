package mw.pos.service;

import com.pos.entity.*;

public interface ISellhurryService {
	int insert(sellhurry sellhurry);
	sellhurry selectByPrimaryKey(sellhurryKey sellhurryKey);
	int updateByPrimaryKeySelective(sellhurry sellhurry);
	int deleteByPrimaryKey(sellhurryKey sellhurryKey);
	int updateByPrimaryKey(sellhurry sellhurry);
	int insertSelective(sellhurry sellhurry);

}
