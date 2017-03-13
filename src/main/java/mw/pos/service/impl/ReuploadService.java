package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("ReuploadService")
public class ReuploadService implements IReuploadService {
	@Resource
	private ReuploadMapper ReuploadMapper;

	public int insert(Reupload reupload){
		return ReuploadMapper.insert(reupload);
	}
	public int insertSelective(Reupload reupload){
		return ReuploadMapper.insertSelective(reupload);
	}
	public int deleteByPrimaryKey(String string){
		return ReuploadMapper.deleteByPrimaryKey(string);
	}
	public Reupload selectByPrimaryKey(String string){
		return ReuploadMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKey(Reupload reupload){
		return ReuploadMapper.updateByPrimaryKey(reupload);
	}
	public int updateByPrimaryKeySelective(Reupload reupload){
		return ReuploadMapper.updateByPrimaryKeySelective(reupload);
	}


}
