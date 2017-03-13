package mw.pos.service;

import com.pos.entity.*;

public interface IPrintprojectgpService {
	int insert(Printprojectgp printprojectgp);
	int deleteByPrimaryKey(PrintprojectgpKey printprojectgpKey);
	int updateByPrimaryKey(Printprojectgp printprojectgp);
	Printprojectgp selectByPrimaryKey(PrintprojectgpKey printprojectgpKey);
	int insertSelective(Printprojectgp printprojectgp);
	int updateByPrimaryKeySelective(Printprojectgp printprojectgp);

}
