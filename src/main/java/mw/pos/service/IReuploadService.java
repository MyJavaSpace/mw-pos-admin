package mw.pos.service;

import com.pos.entity.*;

public interface IReuploadService {
	int insert(Reupload reupload);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(Reupload reupload);
	Reupload selectByPrimaryKey(String string);
	int insertSelective(Reupload reupload);
	int updateByPrimaryKeySelective(Reupload reupload);

}
