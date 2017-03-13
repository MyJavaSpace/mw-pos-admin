package mw.pos.service;

import com.pos.entity.*;

public interface IWebmenuService {
	int insert(Webmenu webmenu);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Webmenu webmenu);
	Webmenu selectByPrimaryKey(Integer integer);
	int insertSelective(Webmenu webmenu);
	int updateByPrimaryKeySelective(Webmenu webmenu);

}
