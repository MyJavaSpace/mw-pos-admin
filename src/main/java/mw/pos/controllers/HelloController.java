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
import com.pos.entity.*;

//import mw.pos.service.IUserService;

import mw.pos.aop.ISysLog;
import mw.pos.handler.ExceptionResultInfo;
import mw.pos.handler.ResultInfo;
import mw.pos.service.*;
 

@Controller
@RequestMapping("/")
public class HelloController {

	private static Logger logger = Logger.getLogger(HelloController.class);
	@Resource
	private IUserService userService = null;
	@Resource
	private IAddrService addrService = null;
	@RequestMapping(value = "hellomvc", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	@ISysLog(module = "hello", methods = "index")
	@Transactional
	@ResponseBody
	public ResultInfo indexPage(Model model) throws Exception {
		ResultInfo<String> resultInfo = new ResultInfo<String>();
		resultInfo.setData("string fangxin");
		resultInfo.setMessage("异常测试");
		/*Addr addr=new Addr();
		addr.setFscityid("8");
		addr.setFsdistrictid("8");
		addr.setFsprovinceid("8");
		addrService.insert(addr);*/
//		logger.info(JSON.toJSONString(addr));
		// throw new ExceptionResultInfo(resultInfo);
		// ModelAndView mv = new ModelAndView("hellomvc");//默认为forward模式
		
		 /* Tbuser user = userService.getUserById(); model.addAttribute("res",
		 JSON.toJSONString(user));
		  
		  */
		 
		return resultInfo;
	}
	@RequestMapping(value = "page404", method = RequestMethod.GET)
	@ISysLog(module = "hello", methods = "index")
	@Transactional
	@ResponseBody
	public ResultInfo page404(Model model) throws Exception {
		ResultInfo<String> resultInfo = new ResultInfo<String>();
		resultInfo.setData("404");
		resultInfo.setMessage("请求不存在");
		return resultInfo;
	}
	 
	@RequestMapping(value = "getuser", method = RequestMethod.GET)
	public User geTbuser() {
		UserKey userKey = new UserKey();
		userKey.setFsshopguid("25854");
		userKey.setFsstaffid("admin");
		return userService.selectByPrimaryKey(userKey);
	}
}
