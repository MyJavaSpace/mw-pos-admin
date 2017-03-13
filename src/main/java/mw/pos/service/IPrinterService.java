package mw.pos.service;

import com.pos.entity.*;

public interface IPrinterService {
	int insert(printer printer);
	printer selectByPrimaryKey(printerKey printerKey);
	int updateByPrimaryKeySelective(printer printer);
	int deleteByPrimaryKey(printerKey printerKey);
	int updateByPrimaryKey(printer printer);
	int insertSelective(printer printer);

}
