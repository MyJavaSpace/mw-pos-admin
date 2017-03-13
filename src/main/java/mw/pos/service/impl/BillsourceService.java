package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("billsourceService")
public class BillsourceService implements IBillsourceService {
	@Resource
	private BillsourceMapper billsourceMapper;

	public int insert(Billsource billsource){
		return billsourceMapper.insert(billsource);
	}
	public int insertSelective(Billsource billsource){
		return billsourceMapper.insertSelective(billsource);
	}
	public int deleteByPrimaryKey(BillsourceKey billsourceKey){
		return billsourceMapper.deleteByPrimaryKey(billsourceKey);
	}
	public Billsource selectByPrimaryKey(BillsourceKey billsourceKey){
		return billsourceMapper.selectByPrimaryKey(billsourceKey);
	}
	public int updateByPrimaryKeySelective(Billsource billsource){
		return billsourceMapper.updateByPrimaryKeySelective(billsource);
	}
	public int updateByPrimaryKey(Billsource billsource){
		return billsourceMapper.updateByPrimaryKey(billsource);
	}


}
