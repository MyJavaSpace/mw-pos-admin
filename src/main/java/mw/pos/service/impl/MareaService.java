package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mareaService")
public class MareaService implements IMareaService {
	@Resource
	private mareaMapper mareaMapper;

	public int insert(marea marea){
		return mareaMapper.insert(marea);
	}
	public int insertSelective(marea marea){
		return mareaMapper.insertSelective(marea);
	}
	public marea selectByPrimaryKey(mareaKey mareaKey){
		return mareaMapper.selectByPrimaryKey(mareaKey);
	}
	public int deleteByPrimaryKey(mareaKey mareaKey){
		return mareaMapper.deleteByPrimaryKey(mareaKey);
	}
	public int updateByPrimaryKeySelective(marea marea){
		return mareaMapper.updateByPrimaryKeySelective(marea);
	}
	public int updateByPrimaryKey(marea marea){
		return mareaMapper.updateByPrimaryKey(marea);
	}


}
