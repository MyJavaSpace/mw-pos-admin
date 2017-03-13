package mw.pos.service;

import com.pos.entity.*;

public interface IWordhouseService {
	int insert(wordhouse wordhouse);
	wordhouse selectByPrimaryKey(wordhouseKey wordhouseKey);
	int updateByPrimaryKeySelective(wordhouse wordhouse);
	int deleteByPrimaryKey(wordhouseKey wordhouseKey);
	int updateByPrimaryKey(wordhouse wordhouse);
	int insertSelective(wordhouse wordhouse);

}
