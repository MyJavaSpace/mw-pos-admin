package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("askgpService")
public class AskgpService implements IAskgpService {
	@Resource
	private askgpMapper askgpMapper;

	public int insert(askgp askgp){
		return askgpMapper.insert(askgp);
	}
	public int insertSelective(askgp askgp){
		return askgpMapper.insertSelective(askgp);
	}
	public askgp selectByPrimaryKey(askgpKey askgpKey){
		return askgpMapper.selectByPrimaryKey(askgpKey);
	}
	public int deleteByPrimaryKey(askgpKey askgpKey){
		return askgpMapper.deleteByPrimaryKey(askgpKey);
	}
	public int updateByPrimaryKeySelective(askgp askgp){
		return askgpMapper.updateByPrimaryKeySelective(askgp);
	}
	public int updateByPrimaryKey(askgp askgp){
		return askgpMapper.updateByPrimaryKey(askgp);
	}


}
