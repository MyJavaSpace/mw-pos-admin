package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PrintprojectgpService")
public class PrintprojectgpService implements IPrintprojectgpService {
	@Resource
	private PrintprojectgpMapper PrintprojectgpMapper;

	public int insert(Printprojectgp printprojectgp){
		return PrintprojectgpMapper.insert(printprojectgp);
	}
	public int insertSelective(Printprojectgp printprojectgp){
		return PrintprojectgpMapper.insertSelective(printprojectgp);
	}
	public int deleteByPrimaryKey(PrintprojectgpKey printprojectgpKey){
		return PrintprojectgpMapper.deleteByPrimaryKey(printprojectgpKey);
	}
	public Printprojectgp selectByPrimaryKey(PrintprojectgpKey printprojectgpKey){
		return PrintprojectgpMapper.selectByPrimaryKey(printprojectgpKey);
	}
	public int updateByPrimaryKey(Printprojectgp printprojectgp){
		return PrintprojectgpMapper.updateByPrimaryKey(printprojectgp);
	}
	public int updateByPrimaryKeySelective(Printprojectgp printprojectgp){
		return PrintprojectgpMapper.updateByPrimaryKeySelective(printprojectgp);
	}


}
