package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("WordhouseService")
public class WordhouseService implements IWordhouseService {
	@Resource
	private WordhouseMapper WordhouseMapper;

	public int insert(Wordhouse wordhouse){
		return WordhouseMapper.insert(wordhouse);
	}
	public int insertSelective(Wordhouse wordhouse){
		return WordhouseMapper.insertSelective(wordhouse);
	}
	public int deleteByPrimaryKey(WordhouseKey wordhouseKey){
		return WordhouseMapper.deleteByPrimaryKey(wordhouseKey);
	}
	public Wordhouse selectByPrimaryKey(WordhouseKey wordhouseKey){
		return WordhouseMapper.selectByPrimaryKey(wordhouseKey);
	}
	public int updateByPrimaryKey(Wordhouse wordhouse){
		return WordhouseMapper.updateByPrimaryKey(wordhouse);
	}
	public int updateByPrimaryKeySelective(Wordhouse wordhouse){
		return WordhouseMapper.updateByPrimaryKeySelective(wordhouse);
	}


}
