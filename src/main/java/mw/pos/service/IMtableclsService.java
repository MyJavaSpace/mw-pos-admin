package mw.pos.service;

import com.pos.entity.*;

public interface IMtableclsService {
	int insert(Mtablecls mtablecls);
	int deleteByPrimaryKey(MtableclsKey mtableclsKey);
	int updateByPrimaryKey(Mtablecls mtablecls);
	Mtablecls selectByPrimaryKey(MtableclsKey mtableclsKey);
	int insertSelective(Mtablecls mtablecls);
	int updateByPrimaryKeySelective(Mtablecls mtablecls);

}
