package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("changetableService")
public class ChangetableService implements IChangetableService {
	@Resource
	private ChangetableMapper changetableMapper;

	public int insert(Changetable changetable){
		return changetableMapper.insert(changetable);
	}
	public int insertSelective(Changetable changetable){
		return changetableMapper.insertSelective(changetable);
	}


}
