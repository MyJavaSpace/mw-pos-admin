package mw.pos.service;

import com.pos.entity.*;

public interface ISellhurryService {
	int insert(Sellhurry sellhurry);
	int deleteByPrimaryKey(SellhurryKey sellhurryKey);
	int updateByPrimaryKey(Sellhurry sellhurry);
	Sellhurry selectByPrimaryKey(SellhurryKey sellhurryKey);
	int insertSelective(Sellhurry sellhurry);
	int updateByPrimaryKeySelective(Sellhurry sellhurry);

}
