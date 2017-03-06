package mw.pos.controllers;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.pos.entity.Tbuser;
import com.pos.service.IUserService;

import mw.pos.aop.ISysLog;

 

@Controller
@RequestMapping("/")
public class HelloController {

	private static Logger logger = Logger.getLogger(HelloController.class); 
	@Resource  
    private IUserService userService = null;  
	@RequestMapping(value = "hellomvc", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	@ISysLog(module="hello",methods="index")
	public ModelAndView indexPage(Model model) throws Exception {
		ModelAndView mv = new ModelAndView("hellomvc");//默认为forward模式  
		Tbuser user = userService.getUserById();  
		model.addAttribute("res", JSON.toJSONString(user));
		
        logger.info(JSON.toJSONString(user));  
		return  mv;
	}
	
}
