package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("BuygiftitemService")
public class BuygiftitemService implements IBuygiftitemService {
	@Resource
	private BuygiftitemMapper BuygiftitemMapper;

	public int insert(Buygiftitem buygiftitem){
		return BuygiftitemMapper.insert(buygiftitem);
	}
	public int insertSelective(Buygiftitem buygiftitem){
		return BuygiftitemMapper.insertSelective(buygiftitem);
	}
	public int deleteByPrimaryKey(BuygiftitemKey buygiftitemKey){
		return BuygiftitemMapper.deleteByPrimaryKey(buygiftitemKey);
	}
	public Buygiftitem selectByPrimaryKey(BuygiftitemKey buygiftitemKey){
		return BuygiftitemMapper.selectByPrimaryKey(buygiftitemKey);
	}
	public int updateByPrimaryKey(Buygiftitem buygiftitem){
		return BuygiftitemMapper.updateByPrimaryKey(buygiftitem);
	}
	public int updateByPrimaryKeySelective(Buygiftitem buygiftitem){
		return BuygiftitemMapper.updateByPrimaryKeySelective(buygiftitem);
	}


}
