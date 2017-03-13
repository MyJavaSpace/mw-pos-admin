package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("buygiftitemService")
public class BuygiftitemService implements IBuygiftitemService {
	@Resource
	private buygiftitemMapper buygiftitemMapper;

	public int insert(buygiftitem buygiftitem){
		return buygiftitemMapper.insert(buygiftitem);
	}
	public int insertSelective(buygiftitem buygiftitem){
		return buygiftitemMapper.insertSelective(buygiftitem);
	}
	public buygiftitem selectByPrimaryKey(buygiftitemKey buygiftitemKey){
		return buygiftitemMapper.selectByPrimaryKey(buygiftitemKey);
	}
	public int deleteByPrimaryKey(buygiftitemKey buygiftitemKey){
		return buygiftitemMapper.deleteByPrimaryKey(buygiftitemKey);
	}
	public int updateByPrimaryKeySelective(buygiftitem buygiftitem){
		return buygiftitemMapper.updateByPrimaryKeySelective(buygiftitem);
	}
	public int updateByPrimaryKey(buygiftitem buygiftitem){
		return buygiftitemMapper.updateByPrimaryKey(buygiftitem);
	}


}
