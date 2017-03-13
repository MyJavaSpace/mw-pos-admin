package mw.pos.service;

import com.pos.entity.*;

public interface ITransferprnService {
	int insert(transferprn transferprn);
	transferprn selectByPrimaryKey(transferprnKey transferprnKey);
	int updateByPrimaryKeySelective(transferprn transferprn);
	int deleteByPrimaryKey(transferprnKey transferprnKey);
	int updateByPrimaryKey(transferprn transferprn);
	int insertSelective(transferprn transferprn);

}
