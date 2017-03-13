package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("BargainitemService")
public class BargainitemService implements IBargainitemService {
	@Resource
	private BargainitemMapper BargainitemMapper;

	public int insert(Bargainitem bargainitem){
		return BargainitemMapper.insert(bargainitem);
	}
	public int insertSelective(Bargainitem bargainitem){
		return BargainitemMapper.insertSelective(bargainitem);
	}
	public int deleteByPrimaryKey(BargainitemKey bargainitemKey){
		return BargainitemMapper.deleteByPrimaryKey(bargainitemKey);
	}
	public Bargainitem selectByPrimaryKey(BargainitemKey bargainitemKey){
		return BargainitemMapper.selectByPrimaryKey(bargainitemKey);
	}
	public int updateByPrimaryKey(Bargainitem bargainitem){
		return BargainitemMapper.updateByPrimaryKey(bargainitem);
	}
	public int updateByPrimaryKeySelective(Bargainitem bargainitem){
		return BargainitemMapper.updateByPrimaryKeySelective(bargainitem);
	}


}
