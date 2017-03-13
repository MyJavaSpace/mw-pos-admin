package mw.pos.service;

import com.pos.entity.*;

public interface ISellhurryitemService {
	int insert(Sellhurryitem sellhurryitem);
	int deleteByPrimaryKey(SellhurryitemKey sellhurryitemKey);
	int updateByPrimaryKey(Sellhurryitem sellhurryitem);
	Sellhurryitem selectByPrimaryKey(SellhurryitemKey sellhurryitemKey);
	int insertSelective(Sellhurryitem sellhurryitem);
	int updateByPrimaryKeySelective(Sellhurryitem sellhurryitem);

}
