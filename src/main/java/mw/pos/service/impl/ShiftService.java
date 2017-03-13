package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("shiftService")
public class ShiftService implements IShiftService {
	@Resource
	private ShiftMapper shiftMapper;

	public int insert(Shift shift){
		return shiftMapper.insert(shift);
	}
	public int insertSelective(Shift shift){
		return shiftMapper.insertSelective(shift);
	}
	public int deleteByPrimaryKey(ShiftKey shiftKey){
		return shiftMapper.deleteByPrimaryKey(shiftKey);
	}
	public Shift selectByPrimaryKey(ShiftKey shiftKey){
		return shiftMapper.selectByPrimaryKey(shiftKey);
	}
	public int updateByPrimaryKeySelective(Shift shift){
		return shiftMapper.updateByPrimaryKeySelective(shift);
	}
	public int updateByPrimaryKey(Shift shift){
		return shiftMapper.updateByPrimaryKey(shift);
	}


}
