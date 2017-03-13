package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("applicationService")
public class ApplicationService implements IApplicationService {
	@Resource
	private applicationMapper applicationMapper;

	public int insert(application application){
		return applicationMapper.insert(application);
	}
	public int insertSelective(application application){
		return applicationMapper.insertSelective(application);
	}
	public application selectByPrimaryKey(applicationKey applicationKey){
		return applicationMapper.selectByPrimaryKey(applicationKey);
	}
	public int deleteByPrimaryKey(applicationKey applicationKey){
		return applicationMapper.deleteByPrimaryKey(applicationKey);
	}
	public int updateByPrimaryKeySelective(application application){
		return applicationMapper.updateByPrimaryKeySelective(application);
	}
	public int updateByPrimaryKey(application application){
		return applicationMapper.updateByPrimaryKey(application);
	}


}
