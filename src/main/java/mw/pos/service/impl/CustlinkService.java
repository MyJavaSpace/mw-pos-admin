package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("custlinkService")
public class CustlinkService implements ICustlinkService {
	@Resource
	private CustlinkMapper custlinkMapper;

	public int insert(CustlinkKey custlinkKey){
		return custlinkMapper.insert(custlinkKey);
	}
	public int insertSelective(CustlinkKey custlinkKey){
		return custlinkMapper.insertSelective(custlinkKey);
	}
	public int deleteByPrimaryKey(CustlinkKey custlinkKey){
		return custlinkMapper.deleteByPrimaryKey(custlinkKey);
	}


}
