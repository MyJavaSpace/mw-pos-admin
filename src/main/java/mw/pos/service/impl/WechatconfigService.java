package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("wechatconfigService")
public class WechatconfigService implements IWechatconfigService {
	@Resource
	private WechatconfigMapper wechatconfigMapper;

	public int insert(Wechatconfig wechatconfig){
		return wechatconfigMapper.insert(wechatconfig);
	}
	public int insertSelective(Wechatconfig wechatconfig){
		return wechatconfigMapper.insertSelective(wechatconfig);
	}
	public int deleteByPrimaryKey(String string){
		return wechatconfigMapper.deleteByPrimaryKey(string);
	}
	public Wechatconfig selectByPrimaryKey(String string){
		return wechatconfigMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Wechatconfig wechatconfig){
		return wechatconfigMapper.updateByPrimaryKeySelective(wechatconfig);
	}
	public int updateByPrimaryKey(Wechatconfig wechatconfig){
		return wechatconfigMapper.updateByPrimaryKey(wechatconfig);
	}


}
