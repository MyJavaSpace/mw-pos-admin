package mw.pos.controllers;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
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
		resultInfo.setData(addrService.insert(tbaddr));
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

	@RequestMapping(value = "selectbyprimarykey")
	public ResponseEntity<Addr> selectByPrimaryKey(@RequestBody AddrKey tbaddrKey) {
		return new ResponseEntity<Addr>(addrService.selectByPrimaryKey(tbaddrKey), HttpStatus.OK);
	}

	@RequestMapping(value = "updatebyprimarykeyselective", method = RequestMethod.PUT)
	public Integer updateByPrimaryKeySelective(@RequestBody Addr tbaddr) {
		return addrService.updateByPrimaryKeySelective(tbaddr);
	}

	@RequestMapping(value = "updatebyprimarykey", method = RequestMethod.PUT)
	public Integer updateByPrimaryKey(@RequestBody Addr tbaddr) {
		return addrService.updateByPrimaryKey(tbaddr);
	}

	@RequestMapping(value = "deletebyprimarykey", method = RequestMethod.DELETE)
	public Integer deleteByPrimaryKey(AddrKey tbaddrKey) {
		return addrService.deleteByPrimaryKey(tbaddrKey);
	}
}
