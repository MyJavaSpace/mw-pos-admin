package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("applicationService")
public class ApplicationService implements IApplicationService {
	@Resource
	private ApplicationMapper applicationMapper;

	public int insert(Application application){
		return applicationMapper.insert(application);
	}
	public int insertSelective(Application application){
		return applicationMapper.insertSelective(application);
	}
	public int deleteByPrimaryKey(ApplicationKey applicationKey){
		return applicationMapper.deleteByPrimaryKey(applicationKey);
	}
	public Application selectByPrimaryKey(ApplicationKey applicationKey){
		return applicationMapper.selectByPrimaryKey(applicationKey);
	}
	public int updateByPrimaryKeySelective(Application application){
		return applicationMapper.updateByPrimaryKeySelective(application);
	}
	public int updateByPrimaryKey(Application application){
		return applicationMapper.updateByPrimaryKey(application);
	}


}
