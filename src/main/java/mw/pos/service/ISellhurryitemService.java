package mw.pos.service;

import com.pos.entity.*;

public interface ISellhurryitemService {
	int insert(sellhurryitem sellhurryitem);
	sellhurryitem selectByPrimaryKey(sellhurryitemKey sellhurryitemKey);
	int updateByPrimaryKeySelective(sellhurryitem sellhurryitem);
	int deleteByPrimaryKey(sellhurryitemKey sellhurryitemKey);
	int updateByPrimaryKey(sellhurryitem sellhurryitem);
	int insertSelective(sellhurryitem sellhurryitem);

}
