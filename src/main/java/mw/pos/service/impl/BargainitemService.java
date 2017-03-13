package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("bargainitemService")
public class BargainitemService implements IBargainitemService {
	@Resource
	private BargainitemMapper bargainitemMapper;

	public int insert(Bargainitem bargainitem){
		return bargainitemMapper.insert(bargainitem);
	}
	public int insertSelective(Bargainitem bargainitem){
		return bargainitemMapper.insertSelective(bargainitem);
	}
	public int deleteByPrimaryKey(BargainitemKey bargainitemKey){
		return bargainitemMapper.deleteByPrimaryKey(bargainitemKey);
	}
	public Bargainitem selectByPrimaryKey(BargainitemKey bargainitemKey){
		return bargainitemMapper.selectByPrimaryKey(bargainitemKey);
	}
	public int updateByPrimaryKeySelective(Bargainitem bargainitem){
		return bargainitemMapper.updateByPrimaryKeySelective(bargainitem);
	}
	public int updateByPrimaryKey(Bargainitem bargainitem){
		return bargainitemMapper.updateByPrimaryKey(bargainitem);
	}


}
