package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printtaskService")
public class PrinttaskService implements IPrinttaskService {
	@Resource
	private printtaskMapper printtaskMapper;

	public int insert(printtaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.insert(printtaskWithBLOBs);
	}
	public int insertSelective(printtaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.insertSelective(printtaskWithBLOBs);
	}
	public printtaskWithBLOBs selectByPrimaryKey(Integer integer){
		return printtaskMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return printtaskMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(printtaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.updateByPrimaryKeySelective(printtaskWithBLOBs);
	}
	public int updateByPrimaryKey(printtask printtask){
		return printtaskMapper.updateByPrimaryKey(printtask);
	}
	public int updateByPrimaryKeyWithBLOBs(printtaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.updateByPrimaryKeyWithBLOBs(printtaskWithBLOBs);
	}


}
