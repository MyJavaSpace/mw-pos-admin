package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("wechatconfigService")
public class WechatconfigService implements IWechatconfigService {
	@Resource
	private wechatconfigMapper wechatconfigMapper;

	public int insert(wechatconfig wechatconfig){
		return wechatconfigMapper.insert(wechatconfig);
	}
	public int insertSelective(wechatconfig wechatconfig){
		return wechatconfigMapper.insertSelective(wechatconfig);
	}
	public wechatconfig selectByPrimaryKey(String string){
		return wechatconfigMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return wechatconfigMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(wechatconfig wechatconfig){
		return wechatconfigMapper.updateByPrimaryKeySelective(wechatconfig);
	}
	public int updateByPrimaryKey(wechatconfig wechatconfig){
		return wechatconfigMapper.updateByPrimaryKey(wechatconfig);
	}


}
