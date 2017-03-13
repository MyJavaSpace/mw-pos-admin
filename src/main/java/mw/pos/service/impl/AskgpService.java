package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("AskgpService")
public class AskgpService implements IAskgpService {
	@Resource
	private AskgpMapper AskgpMapper;

	public int insert(Askgp askgp){
		return AskgpMapper.insert(askgp);
	}
	public int insertSelective(Askgp askgp){
		return AskgpMapper.insertSelective(askgp);
	}
	public int deleteByPrimaryKey(AskgpKey askgpKey){
		return AskgpMapper.deleteByPrimaryKey(askgpKey);
	}
	public Askgp selectByPrimaryKey(AskgpKey askgpKey){
		return AskgpMapper.selectByPrimaryKey(askgpKey);
	}
	public int updateByPrimaryKey(Askgp askgp){
		return AskgpMapper.updateByPrimaryKey(askgp);
	}
	public int updateByPrimaryKeySelective(Askgp askgp){
		return AskgpMapper.updateByPrimaryKeySelective(askgp);
	}


}
