package mw.pos.service;

import com.pos.entity.*;

public interface IWebmenuService {
	int insert(webmenu webmenu);
	webmenu selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(webmenu webmenu);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(webmenu webmenu);
	int insertSelective(webmenu webmenu);

}
