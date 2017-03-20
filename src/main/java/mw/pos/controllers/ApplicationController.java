package mw.pos.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pos.entity.*;

import mw.pos.base.BaseController;
import mw.pos.service.*;

@Controller
@RequestMapping("/application")
public class ApplicationController extends BaseController<Application,ApplicationKey> {
	@Autowired
	private IApplicationService applicationService = null;
	private static Logger logger = Logger.getLogger(ApplicationController.class);

	@Autowired
	public void setBaseMapper() {
		super.setBaseService(applicationService);
	}
}
