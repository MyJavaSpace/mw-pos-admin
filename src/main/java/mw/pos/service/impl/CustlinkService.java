package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("CustlinkService")
public class CustlinkService implements ICustlinkService {
	@Resource
	private CustlinkMapper CustlinkMapper;

	public int insert(CustlinkKey custlinkKey){
		return CustlinkMapper.insert(custlinkKey);
	}
	public int insertSelective(CustlinkKey custlinkKey){
		return CustlinkMapper.insertSelective(custlinkKey);
	}
	public int deleteByPrimaryKey(CustlinkKey custlinkKey){
		return CustlinkMapper.deleteByPrimaryKey(custlinkKey);
	}


}
