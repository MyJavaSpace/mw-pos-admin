package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("PrinterService")
public class PrinterService implements IPrinterService {
	@Resource
	private PrinterMapper PrinterMapper;

	public int insert(Printer printer){
		return PrinterMapper.insert(printer);
	}
	public int insertSelective(Printer printer){
		return PrinterMapper.insertSelective(printer);
	}
	public int deleteByPrimaryKey(PrinterKey printerKey){
		return PrinterMapper.deleteByPrimaryKey(printerKey);
	}
	public Printer selectByPrimaryKey(PrinterKey printerKey){
		return PrinterMapper.selectByPrimaryKey(printerKey);
	}
	public int updateByPrimaryKey(Printer printer){
		return PrinterMapper.updateByPrimaryKey(printer);
	}
	public int updateByPrimaryKeySelective(Printer printer){
		return PrinterMapper.updateByPrimaryKeySelective(printer);
	}


}
