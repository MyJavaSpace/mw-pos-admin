package mw.pos.service;

import com.pos.entity.*;

public interface ISellreceiveService {
	int insert(sellreceive sellreceive);
	sellreceive selectByPrimaryKey(sellreceiveKey sellreceiveKey);
	int updateByPrimaryKeySelective(sellreceive sellreceive);
	int deleteByPrimaryKey(sellreceiveKey sellreceiveKey);
	int updateByPrimaryKey(sellreceive sellreceive);
	int insertSelective(sellreceive sellreceive);
	int updateByPrimaryKeyWithBLOBs(sellreceive sellreceive);

}
