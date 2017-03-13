package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ProgdtlService")
public class ProgdtlService implements IProgdtlService {
	@Resource
	private ProgdtlMapper ProgdtlMapper;

	public int insert(Progdtl progdtl){
		return ProgdtlMapper.insert(progdtl);
	}
	public int insertSelective(Progdtl progdtl){
		return ProgdtlMapper.insertSelective(progdtl);
	}
	public int deleteByPrimaryKey(ProgdtlKey progdtlKey){
		return ProgdtlMapper.deleteByPrimaryKey(progdtlKey);
	}
	public Progdtl selectByPrimaryKey(ProgdtlKey progdtlKey){
		return ProgdtlMapper.selectByPrimaryKey(progdtlKey);
	}
	public int updateByPrimaryKey(Progdtl progdtl){
		return ProgdtlMapper.updateByPrimaryKey(progdtl);
	}
	public int updateByPrimaryKeySelective(Progdtl progdtl){
		return ProgdtlMapper.updateByPrimaryKeySelective(progdtl);
	}


}
