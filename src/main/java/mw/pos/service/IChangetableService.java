package mw.pos.service;

import com.pos.entity.*;

public interface IChangetableService {
	int insert(changetable changetable);
	int insertSelective(changetable changetable);

}
