package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("transferprnService")
public class TransferprnService implements ITransferprnService {
	@Resource
	private transferprnMapper transferprnMapper;

	public int insert(transferprn transferprn){
		return transferprnMapper.insert(transferprn);
	}
	public int insertSelective(transferprn transferprn){
		return transferprnMapper.insertSelective(transferprn);
	}
	public transferprn selectByPrimaryKey(transferprnKey transferprnKey){
		return transferprnMapper.selectByPrimaryKey(transferprnKey);
	}
	public int deleteByPrimaryKey(transferprnKey transferprnKey){
		return transferprnMapper.deleteByPrimaryKey(transferprnKey);
	}
	public int updateByPrimaryKeySelective(transferprn transferprn){
		return transferprnMapper.updateByPrimaryKeySelective(transferprn);
	}
	public int updateByPrimaryKey(transferprn transferprn){
		return transferprnMapper.updateByPrimaryKey(transferprn);
	}


}
