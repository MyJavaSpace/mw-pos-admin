package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("askService")
public class AskService implements IAskService {
	@Resource
	private AskMapper askMapper;

	public int insert(Ask ask){
		return askMapper.insert(ask);
	}
	public int insertSelective(Ask ask){
		return askMapper.insertSelective(ask);
	}
	public int deleteByPrimaryKey(AskKey askKey){
		return askMapper.deleteByPrimaryKey(askKey);
	}
	public Ask selectByPrimaryKey(AskKey askKey){
		return askMapper.selectByPrimaryKey(askKey);
	}
	public int updateByPrimaryKeySelective(Ask ask){
		return askMapper.updateByPrimaryKeySelective(ask);
	}
	public int updateByPrimaryKey(Ask ask){
		return askMapper.updateByPrimaryKey(ask);
	}


}
