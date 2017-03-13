package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("SeqnoService")
public class SeqnoService implements ISeqnoService {
	@Resource
	private SeqnoMapper SeqnoMapper;

	public int insert(Seqno seqno){
		return SeqnoMapper.insert(seqno);
	}
	public int insertSelective(Seqno seqno){
		return SeqnoMapper.insertSelective(seqno);
	}
	public int deleteByPrimaryKey(SeqnoKey seqnoKey){
		return SeqnoMapper.deleteByPrimaryKey(seqnoKey);
	}
	public Seqno selectByPrimaryKey(SeqnoKey seqnoKey){
		return SeqnoMapper.selectByPrimaryKey(seqnoKey);
	}
	public int updateByPrimaryKey(Seqno seqno){
		return SeqnoMapper.updateByPrimaryKey(seqno);
	}
	public int updateByPrimaryKeySelective(Seqno seqno){
		return SeqnoMapper.updateByPrimaryKeySelective(seqno);
	}


}
