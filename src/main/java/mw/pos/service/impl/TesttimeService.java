package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("testtimeService")
public class TesttimeService implements ITesttimeService {
	@Resource
	private TesttimeMapper testtimeMapper;

	public int insert(Testtime testtime){
		return testtimeMapper.insert(testtime);
	}
	public int insertSelective(Testtime testtime){
		return testtimeMapper.insertSelective(testtime);
	}


}
