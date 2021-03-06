package mw.pos.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pos.entity.*;

import mw.pos.base.BaseController;
import mw.pos.service.*;

@Controller
@RequestMapping("/addr")
public class AddrController extends BaseController<Addr,AddrKey> {
	@Autowired
	private IAddrService addrService = null;
	private static Logger logger = Logger.getLogger(AddrController.class);

	@Autowired
	public void setBaseMapper() {
		super.setBaseService(addrService);
	}
}
