package mw.pos.service;

import com.pos.entity.*;

public interface ISeqnoService {
	int insert(seqno seqno);
	seqno selectByPrimaryKey(seqnoKey seqnoKey);
	int updateByPrimaryKeySelective(seqno seqno);
	int deleteByPrimaryKey(seqnoKey seqnoKey);
	int updateByPrimaryKey(seqno seqno);
	int insertSelective(seqno seqno);

}
