package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PrintprojectService")
public class PrintprojectService implements IPrintprojectService {
	@Resource
	private PrintprojectMapper PrintprojectMapper;

	public int insert(Printproject printproject){
		return PrintprojectMapper.insert(printproject);
	}
	public int insertSelective(Printproject printproject){
		return PrintprojectMapper.insertSelective(printproject);
	}
	public int deleteByPrimaryKey(Integer integer){
		return PrintprojectMapper.deleteByPrimaryKey(integer);
	}
	public Printproject selectByPrimaryKey(Integer integer){
		return PrintprojectMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Printproject printproject){
		return PrintprojectMapper.updateByPrimaryKey(printproject);
	}
	public int updateByPrimaryKeySelective(Printproject printproject){
		return PrintprojectMapper.updateByPrimaryKeySelective(printproject);
	}


}
