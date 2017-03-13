package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ChangetableService")
public class ChangetableService implements IChangetableService {
	@Resource
	private ChangetableMapper ChangetableMapper;

	public int insert(Changetable changetable){
		return ChangetableMapper.insert(changetable);
	}
	public int insertSelective(Changetable changetable){
		return ChangetableMapper.insertSelective(changetable);
	}


}
