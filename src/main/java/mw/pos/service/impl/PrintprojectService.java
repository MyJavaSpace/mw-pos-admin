package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printprojectService")
public class PrintprojectService implements IPrintprojectService {
	@Resource
	private printprojectMapper printprojectMapper;

	public int insert(printproject printproject){
		return printprojectMapper.insert(printproject);
	}
	public int insertSelective(printproject printproject){
		return printprojectMapper.insertSelective(printproject);
	}
	public printproject selectByPrimaryKey(Integer integer){
		return printprojectMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return printprojectMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(printproject printproject){
		return printprojectMapper.updateByPrimaryKeySelective(printproject);
	}
	public int updateByPrimaryKey(printproject printproject){
		return printprojectMapper.updateByPrimaryKey(printproject);
	}


}
