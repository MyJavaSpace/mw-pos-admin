package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("MareaService")
public class MareaService implements IMareaService {
	@Resource
	private MareaMapper MareaMapper;

	public int insert(Marea marea){
		return MareaMapper.insert(marea);
	}
	public int insertSelective(Marea marea){
		return MareaMapper.insertSelective(marea);
	}
	public int deleteByPrimaryKey(MareaKey mareaKey){
		return MareaMapper.deleteByPrimaryKey(mareaKey);
	}
	public Marea selectByPrimaryKey(MareaKey mareaKey){
		return MareaMapper.selectByPrimaryKey(mareaKey);
	}
	public int updateByPrimaryKey(Marea marea){
		return MareaMapper.updateByPrimaryKey(marea);
	}
	public int updateByPrimaryKeySelective(Marea marea){
		return MareaMapper.updateByPrimaryKeySelective(marea);
	}


}
