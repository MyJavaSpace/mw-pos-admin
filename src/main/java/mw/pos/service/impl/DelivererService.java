package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("DelivererService")
public class DelivererService implements IDelivererService {
	@Resource
	private DelivererMapper DelivererMapper;

	public int insert(Deliverer deliverer){
		return DelivererMapper.insert(deliverer);
	}
	public int insertSelective(Deliverer deliverer){
		return DelivererMapper.insertSelective(deliverer);
	}
	public int deleteByPrimaryKey(DelivererKey delivererKey){
		return DelivererMapper.deleteByPrimaryKey(delivererKey);
	}
	public Deliverer selectByPrimaryKey(DelivererKey delivererKey){
		return DelivererMapper.selectByPrimaryKey(delivererKey);
	}
	public int updateByPrimaryKey(Deliverer deliverer){
		return DelivererMapper.updateByPrimaryKey(deliverer);
	}
	public int updateByPrimaryKeySelective(Deliverer deliverer){
		return DelivererMapper.updateByPrimaryKeySelective(deliverer);
	}


}
