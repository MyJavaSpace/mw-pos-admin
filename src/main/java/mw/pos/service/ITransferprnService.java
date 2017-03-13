package mw.pos.service;

import com.pos.entity.*;

public interface ITransferprnService {
	int insert(Transferprn transferprn);
	int deleteByPrimaryKey(TransferprnKey transferprnKey);
	int updateByPrimaryKey(Transferprn transferprn);
	Transferprn selectByPrimaryKey(TransferprnKey transferprnKey);
	int insertSelective(Transferprn transferprn);
	int updateByPrimaryKeySelective(Transferprn transferprn);

}
