package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shiftService")
public class ShiftService implements IShiftService {
	@Resource
	private shiftMapper shiftMapper;

	public int insert(shift shift){
		return shiftMapper.insert(shift);
	}
	public int insertSelective(shift shift){
		return shiftMapper.insertSelective(shift);
	}
	public shift selectByPrimaryKey(shiftKey shiftKey){
		return shiftMapper.selectByPrimaryKey(shiftKey);
	}
	public int deleteByPrimaryKey(shiftKey shiftKey){
		return shiftMapper.deleteByPrimaryKey(shiftKey);
	}
	public int updateByPrimaryKeySelective(shift shift){
		return shiftMapper.updateByPrimaryKeySelective(shift);
	}
	public int updateByPrimaryKey(shift shift){
		return shiftMapper.updateByPrimaryKey(shift);
	}


}
