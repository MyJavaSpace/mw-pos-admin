package mw.pos.service;

import com.pos.entity.*;

public interface IReuploadService {
	int insert(reupload reupload);
	reupload selectByPrimaryKey(String string);
	int updateByPrimaryKeySelective(reupload reupload);
	int deleteByPrimaryKey(String string);
	int updateByPrimaryKey(reupload reupload);
	int insertSelective(reupload reupload);

}
