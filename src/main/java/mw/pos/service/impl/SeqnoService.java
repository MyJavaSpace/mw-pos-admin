package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("seqnoService")
public class SeqnoService implements ISeqnoService {
	@Resource
	private seqnoMapper seqnoMapper;

	public int insert(seqno seqno){
		return seqnoMapper.insert(seqno);
	}
	public int insertSelective(seqno seqno){
		return seqnoMapper.insertSelective(seqno);
	}
	public seqno selectByPrimaryKey(seqnoKey seqnoKey){
		return seqnoMapper.selectByPrimaryKey(seqnoKey);
	}
	public int deleteByPrimaryKey(seqnoKey seqnoKey){
		return seqnoMapper.deleteByPrimaryKey(seqnoKey);
	}
	public int updateByPrimaryKeySelective(seqno seqno){
		return seqnoMapper.updateByPrimaryKeySelective(seqno);
	}
	public int updateByPrimaryKey(seqno seqno){
		return seqnoMapper.updateByPrimaryKey(seqno);
	}


}
