package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printtaskService")
public class PrinttaskService implements IPrinttaskService {
	@Resource
	private PrinttaskMapper printtaskMapper;

	public int insert(PrinttaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.insert(printtaskWithBLOBs);
	}
	public int insertSelective(PrinttaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.insertSelective(printtaskWithBLOBs);
	}
	public int deleteByPrimaryKey(Integer integer){
		return printtaskMapper.deleteByPrimaryKey(integer);
	}
	public PrinttaskWithBLOBs selectByPrimaryKey(Integer integer){
		return printtaskMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(PrinttaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.updateByPrimaryKeySelective(printtaskWithBLOBs);
	}
	public int updateByPrimaryKey(Printtask printtask){
		return printtaskMapper.updateByPrimaryKey(printtask);
	}
	public int updateByPrimaryKeyWithBLOBs(PrinttaskWithBLOBs printtaskWithBLOBs){
		return printtaskMapper.updateByPrimaryKeyWithBLOBs(printtaskWithBLOBs);
	}


}
