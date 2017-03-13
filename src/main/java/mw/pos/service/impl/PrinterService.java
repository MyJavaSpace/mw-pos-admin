package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printerService")
public class PrinterService implements IPrinterService {
	@Resource
	private printerMapper printerMapper;

	public int insert(printer printer){
		return printerMapper.insert(printer);
	}
	public int insertSelective(printer printer){
		return printerMapper.insertSelective(printer);
	}
	public printer selectByPrimaryKey(printerKey printerKey){
		return printerMapper.selectByPrimaryKey(printerKey);
	}
	public int deleteByPrimaryKey(printerKey printerKey){
		return printerMapper.deleteByPrimaryKey(printerKey);
	}
	public int updateByPrimaryKeySelective(printer printer){
		return printerMapper.updateByPrimaryKeySelective(printer);
	}
	public int updateByPrimaryKey(printer printer){
		return printerMapper.updateByPrimaryKey(printer);
	}


}
