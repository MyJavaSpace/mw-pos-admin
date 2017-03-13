package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printprojectgpService")
public class PrintprojectgpService implements IPrintprojectgpService {
	@Resource
	private PrintprojectgpMapper printprojectgpMapper;

	public int insert(Printprojectgp printprojectgp){
		return printprojectgpMapper.insert(printprojectgp);
	}
	public int insertSelective(Printprojectgp printprojectgp){
		return printprojectgpMapper.insertSelective(printprojectgp);
	}
	public int deleteByPrimaryKey(PrintprojectgpKey printprojectgpKey){
		return printprojectgpMapper.deleteByPrimaryKey(printprojectgpKey);
	}
	public Printprojectgp selectByPrimaryKey(PrintprojectgpKey printprojectgpKey){
		return printprojectgpMapper.selectByPrimaryKey(printprojectgpKey);
	}
	public int updateByPrimaryKeySelective(Printprojectgp printprojectgp){
		return printprojectgpMapper.updateByPrimaryKeySelective(printprojectgp);
	}
	public int updateByPrimaryKey(Printprojectgp printprojectgp){
		return printprojectgpMapper.updateByPrimaryKey(printprojectgp);
	}


}
