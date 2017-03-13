package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("fileverService")
public class FileverService implements IFileverService {
	@Resource
	private FileverMapper fileverMapper;

	public int insert(Filever filever){
		return fileverMapper.insert(filever);
	}
	public int insertSelective(Filever filever){
		return fileverMapper.insertSelective(filever);
	}
	public int deleteByPrimaryKey(String string){
		return fileverMapper.deleteByPrimaryKey(string);
	}
	public Filever selectByPrimaryKey(String string){
		return fileverMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Filever filever){
		return fileverMapper.updateByPrimaryKeySelective(filever);
	}
	public int updateByPrimaryKey(Filever filever){
		return fileverMapper.updateByPrimaryKey(filever);
	}


}
