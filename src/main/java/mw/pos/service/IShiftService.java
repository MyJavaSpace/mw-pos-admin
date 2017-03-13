package mw.pos.service;

import com.pos.entity.*;

public interface IShiftService {
	int insert(shift shift);
	shift selectByPrimaryKey(shiftKey shiftKey);
	int updateByPrimaryKeySelective(shift shift);
	int deleteByPrimaryKey(shiftKey shiftKey);
	int updateByPrimaryKey(shift shift);
	int insertSelective(shift shift);

}
