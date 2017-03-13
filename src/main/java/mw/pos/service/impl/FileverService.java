package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("fileverService")
public class FileverService implements IFileverService {
	@Resource
	private fileverMapper fileverMapper;

	public int insert(filever filever){
		return fileverMapper.insert(filever);
	}
	public int insertSelective(filever filever){
		return fileverMapper.insertSelective(filever);
	}
	public filever selectByPrimaryKey(String string){
		return fileverMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return fileverMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(filever filever){
		return fileverMapper.updateByPrimaryKeySelective(filever);
	}
	public int updateByPrimaryKey(filever filever){
		return fileverMapper.updateByPrimaryKey(filever);
	}


}
