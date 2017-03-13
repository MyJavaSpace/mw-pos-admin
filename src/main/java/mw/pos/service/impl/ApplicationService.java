package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ApplicationService")
public class ApplicationService implements IApplicationService {
	@Resource
	private ApplicationMapper ApplicationMapper;

	public int insert(Application application){
		return ApplicationMapper.insert(application);
	}
	public int insertSelective(Application application){
		return ApplicationMapper.insertSelective(application);
	}
	public int deleteByPrimaryKey(ApplicationKey applicationKey){
		return ApplicationMapper.deleteByPrimaryKey(applicationKey);
	}
	public Application selectByPrimaryKey(ApplicationKey applicationKey){
		return ApplicationMapper.selectByPrimaryKey(applicationKey);
	}
	public int updateByPrimaryKey(Application application){
		return ApplicationMapper.updateByPrimaryKey(application);
	}
	public int updateByPrimaryKeySelective(Application application){
		return ApplicationMapper.updateByPrimaryKeySelective(application);
	}


}
