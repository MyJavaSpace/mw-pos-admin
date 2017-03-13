package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("UserdiscountService")
public class UserdiscountService implements IUserdiscountService {
	@Resource
	private UserdiscountMapper UserdiscountMapper;

	public int insert(Userdiscount userdiscount){
		return UserdiscountMapper.insert(userdiscount);
	}
	public int insertSelective(Userdiscount userdiscount){
		return UserdiscountMapper.insertSelective(userdiscount);
	}
	public int deleteByPrimaryKey(UserdiscountKey userdiscountKey){
		return UserdiscountMapper.deleteByPrimaryKey(userdiscountKey);
	}
	public Userdiscount selectByPrimaryKey(UserdiscountKey userdiscountKey){
		return UserdiscountMapper.selectByPrimaryKey(userdiscountKey);
	}
	public int updateByPrimaryKey(Userdiscount userdiscount){
		return UserdiscountMapper.updateByPrimaryKey(userdiscount);
	}
	public int updateByPrimaryKeySelective(Userdiscount userdiscount){
		return UserdiscountMapper.updateByPrimaryKeySelective(userdiscount);
	}


}
