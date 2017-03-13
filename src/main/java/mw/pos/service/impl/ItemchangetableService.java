package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ItemchangetableService")
public class ItemchangetableService implements IItemchangetableService {
	@Resource
	private ItemchangetableMapper ItemchangetableMapper;

	public int insert(Itemchangetable itemchangetable){
		return ItemchangetableMapper.insert(itemchangetable);
	}
	public int insertSelective(Itemchangetable itemchangetable){
		return ItemchangetableMapper.insertSelective(itemchangetable);
	}


}
