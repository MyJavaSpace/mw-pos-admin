package mw.pos.base;

import java.util.List;
import java.util.Map;

import com.pos.base.BaseDao;
import com.pos.base.PageView;
import com.pos.dao.AddrMapper;

public abstract class ServiceBase<T, Key> implements IServiceBase<T, Key> {

	private BaseDao<T, Key> baseMapper;
	public void setBaseMapper(BaseDao<T, Key> baseMapper) {
		// TODO Auto-generated method stub
		this.baseMapper = baseMapper;
	}
	@Override
	public T selectByPrimaryKey(Key key) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(key);
	}

	@Override
	public int deleteByPrimaryKey(Key key) {
		// TODO Auto-generated method stub
		return baseMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insertSelective(T t) {
		// TODO Auto-generated method stub
		return baseMapper.insertSelective(t);
	}

	@Override
	public int updateByPrimaryKeySelective(T t) {
		// TODO Auto-generated method stub
		return baseMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public List<T> getList(T t) {
		// TODO Auto-generated method stub
		return baseMapper.getList(t);
	}

	@Override
	public int getCountSelective(T t) {
		// TODO Auto-generated method stub
		return baseMapper.getCountSelective(t);
	}

	@Override
	public PageView<T> findPage(PageView<T> page, String sql, Map<String, Object> values) {
		// TODO Auto-generated method stub
		return baseMapper.findPage(page, sql, values);
	}

	

}
