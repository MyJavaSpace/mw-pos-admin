package mw.pos.controllers;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.pos.entity.user;
import com.pos.entity.userKey;

//import mw.pos.service.IUserService;

import mw.pos.aop.ISysLog;
import mw.pos.handler.ExceptionResultInfo;
import mw.pos.handler.ResultInfo;
import mw.pos.service.IUserService;

@Controller
@RequestMapping("/")
public class HelloController {

	private static Logger logger = Logger.getLogger(HelloController.class);
	@Resource
	private IUserService userService = null;

	@RequestMapping(value = "hellomvc", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	@ISysLog(module = "hello", methods = "index")
	@Transactional
	@ResponseBody
	public ResultInfo indexPage(Model model) throws Exception {
		ResultInfo<String> resultInfo = new ResultInfo<String>();
		resultInfo.setData("string fangxin");
		resultInfo.setMessage("异常测试");
		// throw new ExceptionResultInfo(resultInfo);
		// ModelAndView mv = new ModelAndView("hellomvc");//默认为forward模式
		/*
		 * Tbuser user = userService.getUserById(); model.addAttribute("res",
		 * JSON.toJSONString(user));
		 * 
		 * logger.info(JSON.toJSONString(user));
		 */
		return resultInfo;
	}

	@ResponseBody
	@RequestMapping(value = "getuser", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	public user geTbuser() {
		userKey userKey = new userKey();
		userKey.setFsshopguid("25854");
		userKey.setFsstaffid("99999");
		return userService.selectByPrimaryKey(userKey);
	}
}
