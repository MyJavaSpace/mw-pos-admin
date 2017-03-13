package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("wordhouseService")
public class WordhouseService implements IWordhouseService {
	@Resource
	private WordhouseMapper wordhouseMapper;

	public int insert(Wordhouse wordhouse){
		return wordhouseMapper.insert(wordhouse);
	}
	public int insertSelective(Wordhouse wordhouse){
		return wordhouseMapper.insertSelective(wordhouse);
	}
	public int deleteByPrimaryKey(WordhouseKey wordhouseKey){
		return wordhouseMapper.deleteByPrimaryKey(wordhouseKey);
	}
	public Wordhouse selectByPrimaryKey(WordhouseKey wordhouseKey){
		return wordhouseMapper.selectByPrimaryKey(wordhouseKey);
	}
	public int updateByPrimaryKeySelective(Wordhouse wordhouse){
		return wordhouseMapper.updateByPrimaryKeySelective(wordhouse);
	}
	public int updateByPrimaryKey(Wordhouse wordhouse){
		return wordhouseMapper.updateByPrimaryKey(wordhouse);
	}


}
