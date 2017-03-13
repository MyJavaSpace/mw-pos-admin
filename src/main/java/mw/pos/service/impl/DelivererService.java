package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("delivererService")
public class DelivererService implements IDelivererService {
	@Resource
	private delivererMapper delivererMapper;

	public int insert(deliverer deliverer){
		return delivererMapper.insert(deliverer);
	}
	public int insertSelective(deliverer deliverer){
		return delivererMapper.insertSelective(deliverer);
	}
	public deliverer selectByPrimaryKey(delivererKey delivererKey){
		return delivererMapper.selectByPrimaryKey(delivererKey);
	}
	public int deleteByPrimaryKey(delivererKey delivererKey){
		return delivererMapper.deleteByPrimaryKey(delivererKey);
	}
	public int updateByPrimaryKeySelective(deliverer deliverer){
		return delivererMapper.updateByPrimaryKeySelective(deliverer);
	}
	public int updateByPrimaryKey(deliverer deliverer){
		return delivererMapper.updateByPrimaryKey(deliverer);
	}


}
