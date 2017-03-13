package mw.pos.service;

import com.pos.entity.*;

public interface IViplvlService {
	int insert(Viplvl viplvl);
	int deleteByPrimaryKey(ViplvlKey viplvlKey);
	int updateByPrimaryKey(Viplvl viplvl);
	Viplvl selectByPrimaryKey(ViplvlKey viplvlKey);
	int insertSelective(Viplvl viplvl);
	int updateByPrimaryKeySelective(Viplvl viplvl);

}
