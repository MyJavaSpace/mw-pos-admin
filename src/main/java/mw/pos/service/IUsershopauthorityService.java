package mw.pos.service;

import com.pos.entity.*;

public interface IUsershopauthorityService {
	int insert(Usershopauthority usershopauthority);
	int deleteByPrimaryKey(UsershopauthorityKey usershopauthorityKey);
	int updateByPrimaryKey(Usershopauthority usershopauthority);
	Usershopauthority selectByPrimaryKey(UsershopauthorityKey usershopauthorityKey);
	int insertSelective(Usershopauthority usershopauthority);
	int updateByPrimaryKeySelective(Usershopauthority usershopauthority);

}
