package mw.pos.service;

import com.pos.entity.*;

public interface IPrinterService {
	int insert(Printer printer);
	int deleteByPrimaryKey(PrinterKey printerKey);
	int updateByPrimaryKey(Printer printer);
	Printer selectByPrimaryKey(PrinterKey printerKey);
	int insertSelective(Printer printer);
	int updateByPrimaryKeySelective(Printer printer);

}
