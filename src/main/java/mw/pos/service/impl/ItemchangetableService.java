package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("itemchangetableService")
public class ItemchangetableService implements IItemchangetableService {
	@Resource
	private itemchangetableMapper itemchangetableMapper;

	public int insert(itemchangetable itemchangetable){
		return itemchangetableMapper.insert(itemchangetable);
	}
	public int insertSelective(itemchangetable itemchangetable){
		return itemchangetableMapper.insertSelective(itemchangetable);
	}


}
