package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("printerService")
public class PrinterService implements IPrinterService {
	@Resource
	private PrinterMapper printerMapper;

	public int insert(Printer printer){
		return printerMapper.insert(printer);
	}
	public int insertSelective(Printer printer){
		return printerMapper.insertSelective(printer);
	}
	public int deleteByPrimaryKey(PrinterKey printerKey){
		return printerMapper.deleteByPrimaryKey(printerKey);
	}
	public Printer selectByPrimaryKey(PrinterKey printerKey){
		return printerMapper.selectByPrimaryKey(printerKey);
	}
	public int updateByPrimaryKeySelective(Printer printer){
		return printerMapper.updateByPrimaryKeySelective(printer);
	}
	public int updateByPrimaryKey(Printer printer){
		return printerMapper.updateByPrimaryKey(printer);
	}


}
