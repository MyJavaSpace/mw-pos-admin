package mw.pos.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mw.pos.handler.ResultInfo;
import mw.pos.util.ConfigUtil;

public class BaseController<T,Key> implements IBaseController<T, Key> {

	private IServiceBase<T, Key>  serviceBase;
	public void setBaseService(IServiceBase<T, Key> serviceBase) {
		this.serviceBase = serviceBase;
	}
	@Override
	public ResultInfo<Integer> insert(T t) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(serviceBase.insertSelective(t));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

	@Override
	public ResultInfo<Integer> insertSelective(T t) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(serviceBase.insertSelective(t));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

	@Override
	public ResultInfo<T> selectByPrimaryKey(Key key) {
		ResultInfo<T> resultInfo = new ResultInfo<T>();
		resultInfo.setData(serviceBase.selectByPrimaryKey(key));
		resultInfo.setStatus(true);
		resultInfo.setMessage(ConfigUtil.getSuccess());
		return resultInfo;
	}

	@Override
	public ResultInfo<PageInfo<T>> getList(T t) {
		PageHelper.startPage(1,10);
		PageInfo<T> pageInfo = new PageInfo<T>(serviceBase.getList(t));
		ResultInfo<PageInfo<T>> resultInfo = new ResultInfo<PageInfo<T>>();
		resultInfo.setData(pageInfo);
		resultInfo.setStatus(true);
		resultInfo.setMessage(ConfigUtil.getSuccess());
		return resultInfo;
	}

	@Override
	public ResultInfo<Integer> updateByPrimaryKeySelective(T t) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(serviceBase.updateByPrimaryKeySelective(t));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

	@Override
	public ResultInfo<Integer> updateByPrimaryKey(T t) {
		ResultInfo<Integer> resultInfo = new ResultInfo<>();
		resultInfo.setData(serviceBase.updateByPrimaryKeySelective(t));
		if (resultInfo.getData() > 0) {
			resultInfo.setStatus(true);
			resultInfo.setMessage(ConfigUtil.getSuccess());
		}
		return resultInfo;
	}

}
