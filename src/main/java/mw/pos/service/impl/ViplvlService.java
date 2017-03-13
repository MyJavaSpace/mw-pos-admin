package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ViplvlService")
public class ViplvlService implements IViplvlService {
	@Resource
	private ViplvlMapper ViplvlMapper;

	public int insert(Viplvl viplvl){
		return ViplvlMapper.insert(viplvl);
	}
	public int insertSelective(Viplvl viplvl){
		return ViplvlMapper.insertSelective(viplvl);
	}
	public int deleteByPrimaryKey(ViplvlKey viplvlKey){
		return ViplvlMapper.deleteByPrimaryKey(viplvlKey);
	}
	public Viplvl selectByPrimaryKey(ViplvlKey viplvlKey){
		return ViplvlMapper.selectByPrimaryKey(viplvlKey);
	}
	public int updateByPrimaryKey(Viplvl viplvl){
		return ViplvlMapper.updateByPrimaryKey(viplvl);
	}
	public int updateByPrimaryKeySelective(Viplvl viplvl){
		return ViplvlMapper.updateByPrimaryKeySelective(viplvl);
	}


}
