package mw.pos.service;

import com.pos.entity.*;

public interface IShiftService {
	int insert(Shift shift);
	int deleteByPrimaryKey(ShiftKey shiftKey);
	int updateByPrimaryKey(Shift shift);
	Shift selectByPrimaryKey(ShiftKey shiftKey);
	int insertSelective(Shift shift);
	int updateByPrimaryKeySelective(Shift shift);

}
