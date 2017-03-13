package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("mareaService")
public class MareaService implements IMareaService {
	@Resource
	private MareaMapper mareaMapper;

	public int insert(Marea marea){
		return mareaMapper.insert(marea);
	}
	public int insertSelective(Marea marea){
		return mareaMapper.insertSelective(marea);
	}
	public int deleteByPrimaryKey(MareaKey mareaKey){
		return mareaMapper.deleteByPrimaryKey(mareaKey);
	}
	public Marea selectByPrimaryKey(MareaKey mareaKey){
		return mareaMapper.selectByPrimaryKey(mareaKey);
	}
	public int updateByPrimaryKeySelective(Marea marea){
		return mareaMapper.updateByPrimaryKeySelective(marea);
	}
	public int updateByPrimaryKey(Marea marea){
		return mareaMapper.updateByPrimaryKey(marea);
	}


}
