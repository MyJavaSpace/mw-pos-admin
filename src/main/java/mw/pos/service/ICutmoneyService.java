package mw.pos.service;

import com.pos.entity.*;

public interface ICutmoneyService {
	int insert(Cutmoney cutmoney);
	int deleteByPrimaryKey(CutmoneyKey cutmoneyKey);
	int updateByPrimaryKey(Cutmoney cutmoney);
	Cutmoney selectByPrimaryKey(CutmoneyKey cutmoneyKey);
	int insertSelective(Cutmoney cutmoney);
	int updateByPrimaryKeySelective(Cutmoney cutmoney);

}
