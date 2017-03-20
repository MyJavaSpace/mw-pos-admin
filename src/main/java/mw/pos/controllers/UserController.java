package mw.pos.controllers;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pos.entity.Addr;
import com.pos.entity.AddrKey;

import mw.pos.base.BaseController;
import mw.pos.service.IAddrService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController<Addr,AddrKey> {
	@Resource
	private IAddrService addrService = null;
	private static Logger logger = Logger.getLogger(UserController.class);
	
    @Autowired
	public void setBaseMapper(){
		super.setBaseService(addrService); 
	}
}
