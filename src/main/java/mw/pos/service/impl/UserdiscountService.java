package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userdiscountService")
public class UserdiscountService implements IUserdiscountService {
	@Resource
	private userdiscountMapper userdiscountMapper;

	public int insert(userdiscount userdiscount){
		return userdiscountMapper.insert(userdiscount);
	}
	public int insertSelective(userdiscount userdiscount){
		return userdiscountMapper.insertSelective(userdiscount);
	}
	public userdiscount selectByPrimaryKey(userdiscountKey userdiscountKey){
		return userdiscountMapper.selectByPrimaryKey(userdiscountKey);
	}
	public int deleteByPrimaryKey(userdiscountKey userdiscountKey){
		return userdiscountMapper.deleteByPrimaryKey(userdiscountKey);
	}
	public int updateByPrimaryKeySelective(userdiscount userdiscount){
		return userdiscountMapper.updateByPrimaryKeySelective(userdiscount);
	}
	public int updateByPrimaryKey(userdiscount userdiscount){
		return userdiscountMapper.updateByPrimaryKey(userdiscount);
	}


}
