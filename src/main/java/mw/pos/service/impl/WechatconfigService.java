package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("WechatconfigService")
public class WechatconfigService implements IWechatconfigService {
	@Resource
	private WechatconfigMapper WechatconfigMapper;

	public int insert(Wechatconfig wechatconfig){
		return WechatconfigMapper.insert(wechatconfig);
	}
	public int insertSelective(Wechatconfig wechatconfig){
		return WechatconfigMapper.insertSelective(wechatconfig);
	}
	public int deleteByPrimaryKey(String string){
		return WechatconfigMapper.deleteByPrimaryKey(string);
	}
	public Wechatconfig selectByPrimaryKey(String string){
		return WechatconfigMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Wechatconfig wechatconfig){
		return WechatconfigMapper.updateByPrimaryKey(wechatconfig);
	}
	public int updateByPrimaryKeySelective(Wechatconfig wechatconfig){
		return WechatconfigMapper.updateByPrimaryKeySelective(wechatconfig);
	}


}
