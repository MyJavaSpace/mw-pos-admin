package mw.pos.service;

import com.pos.entity.*;

public interface IWechatconfigService {
	int insert(wechatconfig wechatconfig);
	wechatconfig selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(wechatconfig wechatconfig);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(wechatconfig wechatconfig);
	int insertSelective(wechatconfig wechatconfig);

}
