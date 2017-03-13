package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("userdiscountService")
public class UserdiscountService implements IUserdiscountService {
	@Resource
	private UserdiscountMapper userdiscountMapper;

	public int insert(Userdiscount userdiscount){
		return userdiscountMapper.insert(userdiscount);
	}
	public int insertSelective(Userdiscount userdiscount){
		return userdiscountMapper.insertSelective(userdiscount);
	}
	public int deleteByPrimaryKey(UserdiscountKey userdiscountKey){
		return userdiscountMapper.deleteByPrimaryKey(userdiscountKey);
	}
	public Userdiscount selectByPrimaryKey(UserdiscountKey userdiscountKey){
		return userdiscountMapper.selectByPrimaryKey(userdiscountKey);
	}
	public int updateByPrimaryKeySelective(Userdiscount userdiscount){
		return userdiscountMapper.updateByPrimaryKeySelective(userdiscount);
	}
	public int updateByPrimaryKey(Userdiscount userdiscount){
		return userdiscountMapper.updateByPrimaryKey(userdiscount);
	}


}
