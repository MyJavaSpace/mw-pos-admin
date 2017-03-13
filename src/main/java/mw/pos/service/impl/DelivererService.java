package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("delivererService")
public class DelivererService implements IDelivererService {
	@Resource
	private DelivererMapper delivererMapper;

	public int insert(Deliverer deliverer){
		return delivererMapper.insert(deliverer);
	}
	public int insertSelective(Deliverer deliverer){
		return delivererMapper.insertSelective(deliverer);
	}
	public int deleteByPrimaryKey(DelivererKey delivererKey){
		return delivererMapper.deleteByPrimaryKey(delivererKey);
	}
	public Deliverer selectByPrimaryKey(DelivererKey delivererKey){
		return delivererMapper.selectByPrimaryKey(delivererKey);
	}
	public int updateByPrimaryKeySelective(Deliverer deliverer){
		return delivererMapper.updateByPrimaryKeySelective(deliverer);
	}
	public int updateByPrimaryKey(Deliverer deliverer){
		return delivererMapper.updateByPrimaryKey(deliverer);
	}


}
