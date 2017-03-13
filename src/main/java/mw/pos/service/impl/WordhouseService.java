package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("wordhouseService")
public class WordhouseService implements IWordhouseService {
	@Resource
	private wordhouseMapper wordhouseMapper;

	public int insert(wordhouse wordhouse){
		return wordhouseMapper.insert(wordhouse);
	}
	public int insertSelective(wordhouse wordhouse){
		return wordhouseMapper.insertSelective(wordhouse);
	}
	public wordhouse selectByPrimaryKey(wordhouseKey wordhouseKey){
		return wordhouseMapper.selectByPrimaryKey(wordhouseKey);
	}
	public int deleteByPrimaryKey(wordhouseKey wordhouseKey){
		return wordhouseMapper.deleteByPrimaryKey(wordhouseKey);
	}
	public int updateByPrimaryKeySelective(wordhouse wordhouse){
		return wordhouseMapper.updateByPrimaryKeySelective(wordhouse);
	}
	public int updateByPrimaryKey(wordhouse wordhouse){
		return wordhouseMapper.updateByPrimaryKey(wordhouse);
	}


}
