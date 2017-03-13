package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("progdtlService")
public class ProgdtlService implements IProgdtlService {
	@Resource
	private progdtlMapper progdtlMapper;

	public int insert(progdtl progdtl){
		return progdtlMapper.insert(progdtl);
	}
	public int insertSelective(progdtl progdtl){
		return progdtlMapper.insertSelective(progdtl);
	}
	public progdtl selectByPrimaryKey(progdtlKey progdtlKey){
		return progdtlMapper.selectByPrimaryKey(progdtlKey);
	}
	public int deleteByPrimaryKey(progdtlKey progdtlKey){
		return progdtlMapper.deleteByPrimaryKey(progdtlKey);
	}
	public int updateByPrimaryKeySelective(progdtl progdtl){
		return progdtlMapper.updateByPrimaryKeySelective(progdtl);
	}
	public int updateByPrimaryKey(progdtl progdtl){
		return progdtlMapper.updateByPrimaryKey(progdtl);
	}


}
