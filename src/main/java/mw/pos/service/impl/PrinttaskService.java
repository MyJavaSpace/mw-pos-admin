package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PrinttaskService")
public class PrinttaskService implements IPrinttaskService {
	@Resource
	private PrinttaskMapper PrinttaskMapper;

	public int insert(PrinttaskWithBLOBs printtaskWithBLOBs){
		return PrinttaskMapper.insert(printtaskWithBLOBs);
	}
	public int insertSelective(PrinttaskWithBLOBs printtaskWithBLOBs){
		return PrinttaskMapper.insertSelective(printtaskWithBLOBs);
	}
	public int deleteByPrimaryKey(Integer integer){
		return PrinttaskMapper.deleteByPrimaryKey(integer);
	}
	public PrinttaskWithBLOBs selectByPrimaryKey(Integer integer){
		return PrinttaskMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Printtask printtask){
		return PrinttaskMapper.updateByPrimaryKey(printtask);
	}
	public int updateByPrimaryKeySelective(PrinttaskWithBLOBs printtaskWithBLOBs){
		return PrinttaskMapper.updateByPrimaryKeySelective(printtaskWithBLOBs);
	}
	public int updateByPrimaryKeyWithBLOBs(PrinttaskWithBLOBs printtaskWithBLOBs){
		return PrinttaskMapper.updateByPrimaryKeyWithBLOBs(printtaskWithBLOBs);
	}


}
