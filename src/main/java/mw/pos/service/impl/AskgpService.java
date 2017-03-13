package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("askgpService")
public class AskgpService implements IAskgpService {
	@Resource
	private AskgpMapper askgpMapper;

	public int insert(Askgp askgp){
		return askgpMapper.insert(askgp);
	}
	public int insertSelective(Askgp askgp){
		return askgpMapper.insertSelective(askgp);
	}
	public int deleteByPrimaryKey(AskgpKey askgpKey){
		return askgpMapper.deleteByPrimaryKey(askgpKey);
	}
	public Askgp selectByPrimaryKey(AskgpKey askgpKey){
		return askgpMapper.selectByPrimaryKey(askgpKey);
	}
	public int updateByPrimaryKeySelective(Askgp askgp){
		return askgpMapper.updateByPrimaryKeySelective(askgp);
	}
	public int updateByPrimaryKey(Askgp askgp){
		return askgpMapper.updateByPrimaryKey(askgp);
	}


}
