package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("FileverService")
public class FileverService implements IFileverService {
	@Resource
	private FileverMapper FileverMapper;

	public int insert(Filever filever){
		return FileverMapper.insert(filever);
	}
	public int insertSelective(Filever filever){
		return FileverMapper.insertSelective(filever);
	}
	public int deleteByPrimaryKey(String string){
		return FileverMapper.deleteByPrimaryKey(string);
	}
	public Filever selectByPrimaryKey(String string){
		return FileverMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Filever filever){
		return FileverMapper.updateByPrimaryKey(filever);
	}
	public int updateByPrimaryKeySelective(Filever filever){
		return FileverMapper.updateByPrimaryKeySelective(filever);
	}


}
