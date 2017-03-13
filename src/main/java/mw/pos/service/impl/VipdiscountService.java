package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("VipdiscountService")
public class VipdiscountService implements IVipdiscountService {
	@Resource
	private VipdiscountMapper VipdiscountMapper;

	public int insert(Vipdiscount vipdiscount){
		return VipdiscountMapper.insert(vipdiscount);
	}
	public int insertSelective(Vipdiscount vipdiscount){
		return VipdiscountMapper.insertSelective(vipdiscount);
	}
	public int deleteByPrimaryKey(VipdiscountKey vipdiscountKey){
		return VipdiscountMapper.deleteByPrimaryKey(vipdiscountKey);
	}
	public Vipdiscount selectByPrimaryKey(VipdiscountKey vipdiscountKey){
		return VipdiscountMapper.selectByPrimaryKey(vipdiscountKey);
	}
	public int updateByPrimaryKey(Vipdiscount vipdiscount){
		return VipdiscountMapper.updateByPrimaryKey(vipdiscount);
	}
	public int updateByPrimaryKeySelective(Vipdiscount vipdiscount){
		return VipdiscountMapper.updateByPrimaryKeySelective(vipdiscount);
	}


}
