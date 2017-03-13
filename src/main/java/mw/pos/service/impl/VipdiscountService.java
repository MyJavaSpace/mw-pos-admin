package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("vipdiscountService")
public class VipdiscountService implements IVipdiscountService {
	@Resource
	private VipdiscountMapper vipdiscountMapper;

	public int insert(Vipdiscount vipdiscount){
		return vipdiscountMapper.insert(vipdiscount);
	}
	public int insertSelective(Vipdiscount vipdiscount){
		return vipdiscountMapper.insertSelective(vipdiscount);
	}
	public int deleteByPrimaryKey(VipdiscountKey vipdiscountKey){
		return vipdiscountMapper.deleteByPrimaryKey(vipdiscountKey);
	}
	public Vipdiscount selectByPrimaryKey(VipdiscountKey vipdiscountKey){
		return vipdiscountMapper.selectByPrimaryKey(vipdiscountKey);
	}
	public int updateByPrimaryKeySelective(Vipdiscount vipdiscount){
		return vipdiscountMapper.updateByPrimaryKeySelective(vipdiscount);
	}
	public int updateByPrimaryKey(Vipdiscount vipdiscount){
		return vipdiscountMapper.updateByPrimaryKey(vipdiscount);
	}


}
