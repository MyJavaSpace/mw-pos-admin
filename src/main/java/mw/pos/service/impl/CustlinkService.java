package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custlinkService")
public class CustlinkService implements ICustlinkService {
	@Resource
	private custlinkMapper custlinkMapper;

	public int insert(custlinkKey custlinkKey){
		return custlinkMapper.insert(custlinkKey);
	}
	public int insertSelective(custlinkKey custlinkKey){
		return custlinkMapper.insertSelective(custlinkKey);
	}
	public int deleteByPrimaryKey(custlinkKey custlinkKey){
		return custlinkMapper.deleteByPrimaryKey(custlinkKey);
	}


}
