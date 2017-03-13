package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("AskService")
public class AskService implements IAskService {
	@Resource
	private AskMapper AskMapper;

	public int insert(Ask ask){
		return AskMapper.insert(ask);
	}
	public int insertSelective(Ask ask){
		return AskMapper.insertSelective(ask);
	}
	public int deleteByPrimaryKey(AskKey askKey){
		return AskMapper.deleteByPrimaryKey(askKey);
	}
	public Ask selectByPrimaryKey(AskKey askKey){
		return AskMapper.selectByPrimaryKey(askKey);
	}
	public int updateByPrimaryKey(Ask ask){
		return AskMapper.updateByPrimaryKey(ask);
	}
	public int updateByPrimaryKeySelective(Ask ask){
		return AskMapper.updateByPrimaryKeySelective(ask);
	}


}
