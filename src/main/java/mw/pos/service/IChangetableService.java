package mw.pos.service;

import com.pos.entity.*;

public interface IChangetableService {
	int insert(Changetable changetable);
	int insertSelective(Changetable changetable);

}
