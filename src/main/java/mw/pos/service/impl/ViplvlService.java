package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("viplvlService")
public class ViplvlService implements IViplvlService {
	@Resource
	private ViplvlMapper viplvlMapper;

	public int insert(Viplvl viplvl){
		return viplvlMapper.insert(viplvl);
	}
	public int insertSelective(Viplvl viplvl){
		return viplvlMapper.insertSelective(viplvl);
	}
	public int deleteByPrimaryKey(ViplvlKey viplvlKey){
		return viplvlMapper.deleteByPrimaryKey(viplvlKey);
	}
	public Viplvl selectByPrimaryKey(ViplvlKey viplvlKey){
		return viplvlMapper.selectByPrimaryKey(viplvlKey);
	}
	public int updateByPrimaryKeySelective(Viplvl viplvl){
		return viplvlMapper.updateByPrimaryKeySelective(viplvl);
	}
	public int updateByPrimaryKey(Viplvl viplvl){
		return viplvlMapper.updateByPrimaryKey(viplvl);
	}


}
