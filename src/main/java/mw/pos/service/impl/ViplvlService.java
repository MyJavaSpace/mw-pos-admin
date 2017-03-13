package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("viplvlService")
public class ViplvlService implements IViplvlService {
	@Resource
	private viplvlMapper viplvlMapper;

	public int insert(viplvl viplvl){
		return viplvlMapper.insert(viplvl);
	}
	public int insertSelective(viplvl viplvl){
		return viplvlMapper.insertSelective(viplvl);
	}
	public viplvl selectByPrimaryKey(viplvlKey viplvlKey){
		return viplvlMapper.selectByPrimaryKey(viplvlKey);
	}
	public int deleteByPrimaryKey(viplvlKey viplvlKey){
		return viplvlMapper.deleteByPrimaryKey(viplvlKey);
	}
	public int updateByPrimaryKeySelective(viplvl viplvl){
		return viplvlMapper.updateByPrimaryKeySelective(viplvl);
	}
	public int updateByPrimaryKey(viplvl viplvl){
		return viplvlMapper.updateByPrimaryKey(viplvl);
	}


}
