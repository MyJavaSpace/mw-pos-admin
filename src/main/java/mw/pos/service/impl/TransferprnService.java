package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("TransferprnService")
public class TransferprnService implements ITransferprnService {
	@Resource
	private TransferprnMapper TransferprnMapper;

	public int insert(Transferprn transferprn){
		return TransferprnMapper.insert(transferprn);
	}
	public int insertSelective(Transferprn transferprn){
		return TransferprnMapper.insertSelective(transferprn);
	}
	public int deleteByPrimaryKey(TransferprnKey transferprnKey){
		return TransferprnMapper.deleteByPrimaryKey(transferprnKey);
	}
	public Transferprn selectByPrimaryKey(TransferprnKey transferprnKey){
		return TransferprnMapper.selectByPrimaryKey(transferprnKey);
	}
	public int updateByPrimaryKey(Transferprn transferprn){
		return TransferprnMapper.updateByPrimaryKey(transferprn);
	}
	public int updateByPrimaryKeySelective(Transferprn transferprn){
		return TransferprnMapper.updateByPrimaryKeySelective(transferprn);
	}


}
