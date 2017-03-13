package mw.pos.service;

import com.pos.entity.*;

public interface IWebmenugroupService {
	int insert(webmenugroup webmenugroup);
	webmenugroup selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(webmenugroup webmenugroup);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(webmenugroup webmenugroup);
	int insertSelective(webmenugroup webmenugroup);

}
