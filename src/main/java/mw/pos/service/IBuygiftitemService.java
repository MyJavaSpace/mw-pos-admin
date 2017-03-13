package mw.pos.service;

import com.pos.entity.*;

public interface IBuygiftitemService {
	int insert(Buygiftitem buygiftitem);
	int deleteByPrimaryKey(BuygiftitemKey buygiftitemKey);
	int updateByPrimaryKey(Buygiftitem buygiftitem);
	Buygiftitem selectByPrimaryKey(BuygiftitemKey buygiftitemKey);
	int insertSelective(Buygiftitem buygiftitem);
	int updateByPrimaryKeySelective(Buygiftitem buygiftitem);

}
