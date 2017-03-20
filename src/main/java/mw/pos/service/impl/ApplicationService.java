package mw.pos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.entity.*;

import mw.pos.base.ServiceBase;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("applicationService")
public class ApplicationService extends ServiceBase<Application,ApplicationKey> implements IApplicationService {
	@Autowired
	private ApplicationMapper applicationMapper;
    @Autowired
	public void setBaseMapper(){
		super.setBaseMapper(applicationMapper);
	}
}
