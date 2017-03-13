package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printprojectgpService")
public class PrintprojectgpService implements IPrintprojectgpService {
	@Resource
	private printprojectgpMapper printprojectgpMapper;

	public int insert(printprojectgp printprojectgp){
		return printprojectgpMapper.insert(printprojectgp);
	}
	public int insertSelective(printprojectgp printprojectgp){
		return printprojectgpMapper.insertSelective(printprojectgp);
	}
	public printprojectgp selectByPrimaryKey(printprojectgpKey printprojectgpKey){
		return printprojectgpMapper.selectByPrimaryKey(printprojectgpKey);
	}
	public int deleteByPrimaryKey(printprojectgpKey printprojectgpKey){
		return printprojectgpMapper.deleteByPrimaryKey(printprojectgpKey);
	}
	public int updateByPrimaryKeySelective(printprojectgp printprojectgp){
		return printprojectgpMapper.updateByPrimaryKeySelective(printprojectgp);
	}
	public int updateByPrimaryKey(printprojectgp printprojectgp){
		return printprojectgpMapper.updateByPrimaryKey(printprojectgp);
	}


}
