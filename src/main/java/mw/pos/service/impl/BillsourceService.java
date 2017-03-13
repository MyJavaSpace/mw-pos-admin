package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("BillsourceService")
public class BillsourceService implements IBillsourceService {
	@Resource
	private BillsourceMapper BillsourceMapper;

	public int insert(Billsource billsource){
		return BillsourceMapper.insert(billsource);
	}
	public int insertSelective(Billsource billsource){
		return BillsourceMapper.insertSelective(billsource);
	}
	public int deleteByPrimaryKey(BillsourceKey billsourceKey){
		return BillsourceMapper.deleteByPrimaryKey(billsourceKey);
	}
	public Billsource selectByPrimaryKey(BillsourceKey billsourceKey){
		return BillsourceMapper.selectByPrimaryKey(billsourceKey);
	}
	public int updateByPrimaryKey(Billsource billsource){
		return BillsourceMapper.updateByPrimaryKey(billsource);
	}
	public int updateByPrimaryKeySelective(Billsource billsource){
		return BillsourceMapper.updateByPrimaryKeySelective(billsource);
	}


}
