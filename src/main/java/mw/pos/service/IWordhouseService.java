package mw.pos.service;

import com.pos.entity.*;

public interface IWordhouseService {
	int insert(Wordhouse wordhouse);
	int deleteByPrimaryKey(WordhouseKey wordhouseKey);
	int updateByPrimaryKey(Wordhouse wordhouse);
	Wordhouse selectByPrimaryKey(WordhouseKey wordhouseKey);
	int insertSelective(Wordhouse wordhouse);
	int updateByPrimaryKeySelective(Wordhouse wordhouse);

}
