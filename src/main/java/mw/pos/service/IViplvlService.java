package mw.pos.service;

import com.pos.entity.*;

public interface IViplvlService {
	int insert(viplvl viplvl);
	viplvl selectByPrimaryKey(viplvlKey viplvlKey);
	int updateByPrimaryKeySelective(viplvl viplvl);
	int deleteByPrimaryKey(viplvlKey viplvlKey);
	int updateByPrimaryKey(viplvl viplvl);
	int insertSelective(viplvl viplvl);

}
