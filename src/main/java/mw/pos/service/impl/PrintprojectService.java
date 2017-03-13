package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printprojectService")
public class PrintprojectService implements IPrintprojectService {
	@Resource
	private PrintprojectMapper printprojectMapper;

	public int insert(Printproject printproject){
		return printprojectMapper.insert(printproject);
	}
	public int insertSelective(Printproject printproject){
		return printprojectMapper.insertSelective(printproject);
	}
	public int deleteByPrimaryKey(Integer integer){
		return printprojectMapper.deleteByPrimaryKey(integer);
	}
	public Printproject selectByPrimaryKey(Integer integer){
		return printprojectMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Printproject printproject){
		return printprojectMapper.updateByPrimaryKeySelective(printproject);
	}
	public int updateByPrimaryKey(Printproject printproject){
		return printprojectMapper.updateByPrimaryKey(printproject);
	}


}
