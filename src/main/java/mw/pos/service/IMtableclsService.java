package mw.pos.service;

import com.pos.entity.*;

public interface IMtableclsService {
	int insert(mtablecls mtablecls);
	mtablecls selectByPrimaryKey(mtableclsKey mtableclsKey);
	int updateByPrimaryKeySelective(mtablecls mtablecls);
	int deleteByPrimaryKey(mtableclsKey mtableclsKey);
	int updateByPrimaryKey(mtablecls mtablecls);
	int insertSelective(mtablecls mtablecls);

}
