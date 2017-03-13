package mw.pos.service;

import com.pos.entity.*;

public interface IUsershopauthorityService {
	int insert(usershopauthority usershopauthority);
	usershopauthority selectByPrimaryKey(usershopauthorityKey usershopauthorityKey);
	int updateByPrimaryKeySelective(usershopauthority usershopauthority);
	int deleteByPrimaryKey(usershopauthorityKey usershopauthorityKey);
	int updateByPrimaryKey(usershopauthority usershopauthority);
	int insertSelective(usershopauthority usershopauthority);

}
