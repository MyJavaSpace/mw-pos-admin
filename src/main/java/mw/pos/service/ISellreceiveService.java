package mw.pos.service;

import com.pos.entity.*;

public interface ISellreceiveService {
	int insert(Sellreceive sellreceive);
	int updateByPrimaryKeyWithBLOBs(Sellreceive sellreceive);
	int deleteByPrimaryKey(SellreceiveKey sellreceiveKey);
	int updateByPrimaryKey(Sellreceive sellreceive);
	Sellreceive selectByPrimaryKey(SellreceiveKey sellreceiveKey);
	int insertSelective(Sellreceive sellreceive);
	int updateByPrimaryKeySelective(Sellreceive sellreceive);

}
