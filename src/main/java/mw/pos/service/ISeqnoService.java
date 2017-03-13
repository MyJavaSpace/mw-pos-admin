package mw.pos.service;

import com.pos.entity.*;

public interface ISeqnoService {
	int insert(Seqno seqno);
	int deleteByPrimaryKey(SeqnoKey seqnoKey);
	int updateByPrimaryKey(Seqno seqno);
	Seqno selectByPrimaryKey(SeqnoKey seqnoKey);
	int insertSelective(Seqno seqno);
	int updateByPrimaryKeySelective(Seqno seqno);

}
