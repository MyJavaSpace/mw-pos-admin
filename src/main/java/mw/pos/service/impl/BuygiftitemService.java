package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("buygiftitemService")
public class BuygiftitemService implements IBuygiftitemService {
	@Resource
	private BuygiftitemMapper buygiftitemMapper;

	public int insert(Buygiftitem buygiftitem){
		return buygiftitemMapper.insert(buygiftitem);
	}
	public int insertSelective(Buygiftitem buygiftitem){
		return buygiftitemMapper.insertSelective(buygiftitem);
	}
	public int deleteByPrimaryKey(BuygiftitemKey buygiftitemKey){
		return buygiftitemMapper.deleteByPrimaryKey(buygiftitemKey);
	}
	public Buygiftitem selectByPrimaryKey(BuygiftitemKey buygiftitemKey){
		return buygiftitemMapper.selectByPrimaryKey(buygiftitemKey);
	}
	public int updateByPrimaryKeySelective(Buygiftitem buygiftitem){
		return buygiftitemMapper.updateByPrimaryKeySelective(buygiftitem);
	}
	public int updateByPrimaryKey(Buygiftitem buygiftitem){
		return buygiftitemMapper.updateByPrimaryKey(buygiftitem);
	}


}
