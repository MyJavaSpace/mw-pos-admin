package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("progdtlService")
public class ProgdtlService implements IProgdtlService {
	@Resource
	private ProgdtlMapper progdtlMapper;

	public int insert(Progdtl progdtl){
		return progdtlMapper.insert(progdtl);
	}
	public int insertSelective(Progdtl progdtl){
		return progdtlMapper.insertSelective(progdtl);
	}
	public int deleteByPrimaryKey(ProgdtlKey progdtlKey){
		return progdtlMapper.deleteByPrimaryKey(progdtlKey);
	}
	public Progdtl selectByPrimaryKey(ProgdtlKey progdtlKey){
		return progdtlMapper.selectByPrimaryKey(progdtlKey);
	}
	public int updateByPrimaryKeySelective(Progdtl progdtl){
		return progdtlMapper.updateByPrimaryKeySelective(progdtl);
	}
	public int updateByPrimaryKey(Progdtl progdtl){
		return progdtlMapper.updateByPrimaryKey(progdtl);
	}


}
