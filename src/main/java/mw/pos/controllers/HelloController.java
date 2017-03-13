package mw.pos.controllers;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.pos.entity.User;
import com.pos.entity.UserKey;

//import mw.pos.service.IUserService;

import mw.pos.aop.ISysLog;
import mw.pos.handler.ResultInfo;
import mw.pos.service.IAddrService;
import mw.pos.service.IUserService;
import mw.pos.viewmodel.RequestToMethodItem;

@Controller
@RequestMapping("/")
public class HelloController {

	private static Logger logger = Logger.getLogger(HelloController.class);
	@Resource
	private IUserService userService = null;
	@Resource
	private IAddrService addrService = null;
	@Autowired
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

	@RequestMapping(value = "hellomvc", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
	// @ISysLog(module = "hello", methods = "index")
	// @Transactional
	// @ResponseBody
	public ModelAndView indexPage(Model model) throws Exception {
		ResultInfo<String> resultInfo = new ResultInfo<String>();
		resultInfo.setData("string fangxin");
		resultInfo.setMessage("异常测试");
		/*
		 * Addr addr=new Addr(); addr.setFscityid("8");
		 * addr.setFsdistrictid("8"); addr.setFsprovinceid("8");
		 * addrService.insert(addr);
		 */
		// logger.info(JSON.toJSONString(addr));
		// throw new ExceptionResultInfo(resultInfo);
		// ModelAndView mv = new ModelAndView("hellomvc");//默认为forward模式

		/*
		 * Tbuser user = userService.getUserById(); model.addAttribute("res",
		 * JSON.toJSONString(user));
		 * 
		 */

		return new ModelAndView("hellomvc");
	}

	@RequestMapping(value = "page404", method = RequestMethod.GET)
	@ResponseBody
	public ResultInfo page404(Model model) throws Exception {
		ResultInfo<String> resultInfo = new ResultInfo<String>();
		resultInfo.setData("404");
		resultInfo.setMessage("请求不存在");
		return resultInfo;
	}
	@ResponseBody
	@RequestMapping(value = "geturlmapping", method = RequestMethod.GET)
	public ArrayList<HashMap<String, String>> getUrlMapping(Model model) {
		ArrayList<HashMap<String, String>> urlList = new ArrayList<HashMap<String, String>>();  
		  
	        Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping.getHandlerMethods();  
	        for (Map.Entry<RequestMappingInfo, HandlerMethod> m : map.entrySet()) {  
	            HashMap<String, String> hashMap = new HashMap<String, String>();  
	            RequestMappingInfo info = m.getKey();  
	            HandlerMethod method = m.getValue();  
	            PatternsRequestCondition p = info.getPatternsCondition();  
	            for (String url : p.getPatterns()) {  
	                hashMap.put("url", url);  
	            }  
	            hashMap.put("className", method.getMethod().getDeclaringClass().getName()); // 类名  
	            hashMap.put("method", method.getMethod().getName()); // 方法名  
	            RequestMethodsRequestCondition methodsCondition = info.getMethodsCondition();  
	            String type = methodsCondition.toString();  
	            if (type != null && type.startsWith("[") && type.endsWith("]")) {  
	                type = type.substring(1, type.length() - 1);  
	                hashMap.put("type", type); // 方法名  
	            }  
	            urlList.add(hashMap);  
	        }  
//	        model.addAttribute("list", urlList);
		return urlList;
	}

	@RequestMapping(value = "getuser", method = RequestMethod.GET)
	public User geTbuser() {
		UserKey userKey = new UserKey();
		userKey.setFsshopguid("25854");
		userKey.setFsstaffid("admin");
		return userService.selectByPrimaryKey(userKey);
	}
}
