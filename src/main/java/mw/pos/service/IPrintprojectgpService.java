package mw.pos.service;

import com.pos.entity.*;

public interface IPrintprojectgpService {
	int insert(printprojectgp printprojectgp);
	printprojectgp selectByPrimaryKey(printprojectgpKey printprojectgpKey);
	int updateByPrimaryKeySelective(printprojectgp printprojectgp);
	int deleteByPrimaryKey(printprojectgpKey printprojectgpKey);
	int updateByPrimaryKey(printprojectgp printprojectgp);
	int insertSelective(printprojectgp printprojectgp);

}
