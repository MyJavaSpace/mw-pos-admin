package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("seqnoService")
public class SeqnoService implements ISeqnoService {
	@Resource
	private SeqnoMapper seqnoMapper;

	public int insert(Seqno seqno){
		return seqnoMapper.insert(seqno);
	}
	public int insertSelective(Seqno seqno){
		return seqnoMapper.insertSelective(seqno);
	}
	public int deleteByPrimaryKey(SeqnoKey seqnoKey){
		return seqnoMapper.deleteByPrimaryKey(seqnoKey);
	}
	public Seqno selectByPrimaryKey(SeqnoKey seqnoKey){
		return seqnoMapper.selectByPrimaryKey(seqnoKey);
	}
	public int updateByPrimaryKeySelective(Seqno seqno){
		return seqnoMapper.updateByPrimaryKeySelective(seqno);
	}
	public int updateByPrimaryKey(Seqno seqno){
		return seqnoMapper.updateByPrimaryKey(seqno);
	}


}
