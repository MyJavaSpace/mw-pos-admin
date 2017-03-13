package mw.pos.service;

import com.pos.entity.*;

public interface IBuygiftitemService {
	int insert(buygiftitem buygiftitem);
	buygiftitem selectByPrimaryKey(buygiftitemKey buygiftitemKey);
	int updateByPrimaryKeySelective(buygiftitem buygiftitem);
	int deleteByPrimaryKey(buygiftitemKey buygiftitemKey);
	int updateByPrimaryKey(buygiftitem buygiftitem);
	int insertSelective(buygiftitem buygiftitem);

}
