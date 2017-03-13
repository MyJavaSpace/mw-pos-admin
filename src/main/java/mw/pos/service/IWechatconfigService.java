package mw.pos.service;

import com.pos.entity.*;

public interface IWechatconfigService {
	int insert(Wechatconfig wechatconfig);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Wechatconfig wechatconfig);
	Wechatconfig selectByPrimaryKey(String string);
	int insertSelective(Wechatconfig wechatconfig);
	int updateByPrimaryKeySelective(Wechatconfig wechatconfig);

}
