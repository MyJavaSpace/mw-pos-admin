package mw.pos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.entity.*;

import mw.pos.base.ServiceBase;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("addrService")
public class AddrService extends ServiceBase<Addr,AddrKey> implements IAddrService {
	@Autowired
	private AddrMapper addrMapper;
    @Autowired
	public void setBaseMapper(){
		super.setBaseMapper(addrMapper);
	}
}
