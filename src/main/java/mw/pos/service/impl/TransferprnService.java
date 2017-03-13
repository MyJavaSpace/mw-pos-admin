package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("transferprnService")
public class TransferprnService implements ITransferprnService {
	@Resource
	private TransferprnMapper transferprnMapper;

	public int insert(Transferprn transferprn){
		return transferprnMapper.insert(transferprn);
	}
	public int insertSelective(Transferprn transferprn){
		return transferprnMapper.insertSelective(transferprn);
	}
	public int deleteByPrimaryKey(TransferprnKey transferprnKey){
		return transferprnMapper.deleteByPrimaryKey(transferprnKey);
	}
	public Transferprn selectByPrimaryKey(TransferprnKey transferprnKey){
		return transferprnMapper.selectByPrimaryKey(transferprnKey);
	}
	public int updateByPrimaryKeySelective(Transferprn transferprn){
		return transferprnMapper.updateByPrimaryKeySelective(transferprn);
	}
	public int updateByPrimaryKey(Transferprn transferprn){
		return transferprnMapper.updateByPrimaryKey(transferprn);
	}


}
