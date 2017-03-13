package mw.pos.controllers;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pos.entity.*;

import mw.pos.service.IAddrService;

@Controller
@RequestMapping("/addr")
public class AddrController {
	@Resource
	private IAddrService addrService = null;

	@RequestMapping(value = "insert", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public ResponseEntity<Integer> insert(@RequestBody addr tbaddr) {
		return new ResponseEntity<Integer>(addrService.insert(tbaddr), HttpStatus.OK);
	}

	@RequestMapping(value = "insertselective", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public Integer insertSelective(@RequestBody addr tbaddr) {
		return addrService.insertSelective(tbaddr);
	}

	@RequestMapping(value = "selectbyprimarykey")
	public ResponseEntity<addr> selectByPrimaryKey(addrKey tbaddrKey) {
		return new ResponseEntity<addr>(addrService.selectByPrimaryKey(tbaddrKey), HttpStatus.OK);
	}

	@RequestMapping(value = "updatebyprimarykeyselective", method = RequestMethod.PUT, produces = "application/json; charset=utf-8")
	public Integer updateByPrimaryKeySelective(@RequestBody addr tbaddr) {
		return addrService.updateByPrimaryKeySelective(tbaddr);
	}

	@RequestMapping(value = "updatebyprimarykey", method = RequestMethod.PUT, produces = "application/json; charset=utf-8")
	public Integer updateByPrimaryKey(@RequestBody addr tbaddr) {
		return addrService.updateByPrimaryKey(tbaddr);
	}

	@RequestMapping(value = "deletebyprimarykey", method = RequestMethod.DELETE, produces = "application/json; charset=utf-8")
	public Integer deleteByPrimaryKey(@RequestBody addrKey tbaddrKey) {
		return addrService.deleteByPrimaryKey(tbaddrKey);
	}
}