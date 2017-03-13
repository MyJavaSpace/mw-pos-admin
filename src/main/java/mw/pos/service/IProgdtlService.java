package mw.pos.service;

import com.pos.entity.*;

public interface IProgdtlService {
	int insert(Progdtl progdtl);
	int deleteByPrimaryKey(ProgdtlKey progdtlKey);
	int updateByPrimaryKey(Progdtl progdtl);
	Progdtl selectByPrimaryKey(ProgdtlKey progdtlKey);
	int insertSelective(Progdtl progdtl);
	int updateByPrimaryKeySelective(Progdtl progdtl);

}
