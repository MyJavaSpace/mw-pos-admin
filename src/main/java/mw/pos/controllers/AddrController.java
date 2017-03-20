package mw.pos.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
 
import com.pos.entity.*;

import mw.pos.handler.ResultInfo;
import mw.pos.service.*;
import mw.pos.util.ConfigUtil;

@Controller
@RequestMapping("/addr")
public class AddrController {
	@Resource
	private IAddrService addrService = null;
	private static Logger logger = Logger.getLogger(AddrController.class);

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public ResultInfo<Integer> insert(@RequestBody Addr tbaddr) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(addrService.insertSelective(tbaddr));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

	@RequestMapping(value = "insertselective", method = RequestMethod.POST)
	public ResultInfo<Integer> insertSelective(@RequestBody Addr tbaddr) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(addrService.insertSelective(tbaddr));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

	@RequestMapping(value = "selectbyprimarykey", method = RequestMethod.GET)
	@ResponseBody
	public ResultInfo<Addr> selectByPrimaryKey(AddrKey tbaddrKey) {
		ResultInfo<Addr> resultInfo = new ResultInfo<Addr>();
		resultInfo.setData(addrService.selectByPrimaryKey(tbaddrKey));
		resultInfo.setStatus(true);
		resultInfo.setMessage(ConfigUtil.getSuccess());
		return resultInfo;
	}

	@RequestMapping(value = "getList", method = RequestMethod.GET)
	@ResponseBody
	public ResultInfo<PageInfo<Addr>> getList(Addr tbaddr) {
		logger.info("logger=" + JSON.toJSONString(tbaddr));
		PageHelper.startPage(1,10);
		PageInfo<Addr> pageInfo = new PageInfo<Addr>(addrService.getList(tbaddr));
		ResultInfo<PageInfo<Addr>> resultInfo = new ResultInfo<PageInfo<Addr>>();
		resultInfo.setData(pageInfo);
		resultInfo.setStatus(true);
		resultInfo.setMessage(ConfigUtil.getSuccess());
		return resultInfo;
	}

	@RequestMapping(value = "updatebyprimarykeyselective", method = RequestMethod.PUT)
	public ResultInfo<Integer> updateByPrimaryKeySelective(@RequestBody Addr tbaddr) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(addrService.updateByPrimaryKeySelective(tbaddr));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

	@RequestMapping(value = "updatebyprimarykey", method = RequestMethod.PUT)
	public ResultInfo<Integer> updateByPrimaryKey(@RequestBody Addr tbaddr) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(addrService.updateByPrimaryKeySelective(tbaddr));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;

	}

	/*
	 * @RequestMapping(value = "deletebyprimarykey", method =
	 * RequestMethod.DELETE) public ResultInfo<Integer>
	 * deleteByPrimaryKey(AddrKey tbaddrKey) { ResultInfo<Integer> resultInfo =
	 * new ResultInfo<>();
	 * resultInfo.setData(addrService.deleteByPrimaryKey(tbaddrKey)); if
	 * (resultInfo.getData() > 0) { resultInfo.setStatus(true);
	 * resultInfo.setMessage(ConfigUtil.getSuccess()); } return resultInfo; }
	 */
}
