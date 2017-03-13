package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("TesttimeService")
public class TesttimeService implements ITesttimeService {
	@Resource
	private TesttimeMapper TesttimeMapper;

	public int insert(Testtime testtime){
		return TesttimeMapper.insert(testtime);
	}
	public int insertSelective(Testtime testtime){
		return TesttimeMapper.insertSelective(testtime);
	}


}
