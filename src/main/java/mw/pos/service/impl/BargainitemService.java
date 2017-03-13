package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("bargainitemService")
public class BargainitemService implements IBargainitemService {
	@Resource
	private bargainitemMapper bargainitemMapper;

	public int insert(bargainitem bargainitem){
		return bargainitemMapper.insert(bargainitem);
	}
	public int insertSelective(bargainitem bargainitem){
		return bargainitemMapper.insertSelective(bargainitem);
	}
	public bargainitem selectByPrimaryKey(bargainitemKey bargainitemKey){
		return bargainitemMapper.selectByPrimaryKey(bargainitemKey);
	}
	public int deleteByPrimaryKey(bargainitemKey bargainitemKey){
		return bargainitemMapper.deleteByPrimaryKey(bargainitemKey);
	}
	public int updateByPrimaryKeySelective(bargainitem bargainitem){
		return bargainitemMapper.updateByPrimaryKeySelective(bargainitem);
	}
	public int updateByPrimaryKey(bargainitem bargainitem){
		return bargainitemMapper.updateByPrimaryKey(bargainitem);
	}


}
