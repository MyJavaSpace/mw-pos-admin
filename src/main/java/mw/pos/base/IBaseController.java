package mw.pos.base;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.pos.entity.Addr;
import com.pos.entity.AddrKey;

import mw.pos.handler.ResultInfo;

public interface IBaseController<T, Key> {
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	ResultInfo<Integer> insert(@RequestBody T t);

	ResultInfo<Integer> insertSelective(@RequestBody T t);

	@RequestMapping(value = "selectbyprimarykey", method = RequestMethod.GET)
	@ResponseBody
	ResultInfo<T> selectByPrimaryKey(Key key);

	@RequestMapping(value = "getList", method = RequestMethod.GET)
	@ResponseBody
	ResultInfo<PageInfo<T>> getList(T t);

	@RequestMapping(value = "updatebyprimarykeyselective", method = RequestMethod.PUT)
	ResultInfo<Integer> updateByPrimaryKeySelective(@RequestBody T t);

	@RequestMapping(value = "updatebyprimarykey", method = RequestMethod.PUT)
	ResultInfo<Integer> updateByPrimaryKey(@RequestBody T t);
}
