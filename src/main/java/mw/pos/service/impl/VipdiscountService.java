package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("vipdiscountService")
public class VipdiscountService implements IVipdiscountService {
	@Resource
	private vipdiscountMapper vipdiscountMapper;

	public int insert(vipdiscount vipdiscount){
		return vipdiscountMapper.insert(vipdiscount);
	}
	public int insertSelective(vipdiscount vipdiscount){
		return vipdiscountMapper.insertSelective(vipdiscount);
	}
	public vipdiscount selectByPrimaryKey(vipdiscountKey vipdiscountKey){
		return vipdiscountMapper.selectByPrimaryKey(vipdiscountKey);
	}
	public int deleteByPrimaryKey(vipdiscountKey vipdiscountKey){
		return vipdiscountMapper.deleteByPrimaryKey(vipdiscountKey);
	}
	public int updateByPrimaryKeySelective(vipdiscount vipdiscount){
		return vipdiscountMapper.updateByPrimaryKeySelective(vipdiscount);
	}
	public int updateByPrimaryKey(vipdiscount vipdiscount){
		return vipdiscountMapper.updateByPrimaryKey(vipdiscount);
	}


}
