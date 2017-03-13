package mw.pos.service;

import com.pos.entity.*;

public interface IProgdtlService {
	int insert(progdtl progdtl);
	progdtl selectByPrimaryKey(progdtlKey progdtlKey);
	int updateByPrimaryKeySelective(progdtl progdtl);
	int deleteByPrimaryKey(progdtlKey progdtlKey);
	int updateByPrimaryKey(progdtl progdtl);
	int insertSelective(progdtl progdtl);

}
