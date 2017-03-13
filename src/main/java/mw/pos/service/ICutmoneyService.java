package mw.pos.service;

import com.pos.entity.*;

public interface ICutmoneyService {
	int insert(cutmoney cutmoney);
	cutmoney selectByPrimaryKey(cutmoneyKey cutmoneyKey);
	int updateByPrimaryKeySelective(cutmoney cutmoney);
	int deleteByPrimaryKey(cutmoneyKey cutmoneyKey);
	int updateByPrimaryKey(cutmoney cutmoney);
	int insertSelective(cutmoney cutmoney);

}
