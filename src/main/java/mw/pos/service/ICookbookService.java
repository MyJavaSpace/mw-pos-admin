package mw.pos.service;

import com.pos.entity.*;

public interface ICookbookService {
	int insert(cookbook cookbook);
	cookbook selectByPrimaryKey(cookbookKey cookbookKey);
	int updateByPrimaryKeySelective(cookbook cookbook);
	int deleteByPrimaryKey(cookbookKey cookbookKey);
	int updateByPrimaryKey(cookbook cookbook);
	int insertSelective(cookbook cookbook);

}
