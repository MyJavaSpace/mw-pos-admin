package mw.pos.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pos.entity.*;

import mw.pos.handler.ResultInfo;
import mw.pos.service.*;
import mw.pos.util.ConfigUtil;

@Controller
@RequestMapping("/addr")
public class AddrController {
	@Resource
	private IAddrService addrService = null;

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
