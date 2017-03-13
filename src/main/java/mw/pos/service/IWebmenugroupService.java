package mw.pos.service;

import com.pos.entity.*;

public interface IWebmenugroupService {
	int insert(Webmenugroup webmenugroup);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Webmenugroup webmenugroup);
	Webmenugroup selectByPrimaryKey(Integer integer);
	int insertSelective(Webmenugroup webmenugroup);
	int updateByPrimaryKeySelective(Webmenugroup webmenugroup);

}
