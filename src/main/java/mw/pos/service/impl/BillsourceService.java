package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("billsourceService")
public class BillsourceService implements IBillsourceService {
	@Resource
	private billsourceMapper billsourceMapper;

	public int insert(billsource billsource){
		return billsourceMapper.insert(billsource);
	}
	public int insertSelective(billsource billsource){
		return billsourceMapper.insertSelective(billsource);
	}
	public billsource selectByPrimaryKey(billsourceKey billsourceKey){
		return billsourceMapper.selectByPrimaryKey(billsourceKey);
	}
	public int deleteByPrimaryKey(billsourceKey billsourceKey){
		return billsourceMapper.deleteByPrimaryKey(billsourceKey);
	}
	public int updateByPrimaryKeySelective(billsource billsource){
		return billsourceMapper.updateByPrimaryKeySelective(billsource);
	}
	public int updateByPrimaryKey(billsource billsource){
		return billsourceMapper.updateByPrimaryKey(billsource);
	}


}
