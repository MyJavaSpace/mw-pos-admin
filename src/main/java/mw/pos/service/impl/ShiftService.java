package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ShiftService")
public class ShiftService implements IShiftService {
	@Resource
	private ShiftMapper ShiftMapper;

	public int insert(Shift shift){
		return ShiftMapper.insert(shift);
	}
	public int insertSelective(Shift shift){
		return ShiftMapper.insertSelective(shift);
	}
	public int deleteByPrimaryKey(ShiftKey shiftKey){
		return ShiftMapper.deleteByPrimaryKey(shiftKey);
	}
	public Shift selectByPrimaryKey(ShiftKey shiftKey){
		return ShiftMapper.selectByPrimaryKey(shiftKey);
	}
	public int updateByPrimaryKey(Shift shift){
		return ShiftMapper.updateByPrimaryKey(shift);
	}
	public int updateByPrimaryKeySelective(Shift shift){
		return ShiftMapper.updateByPrimaryKeySelective(shift);
	}


}
