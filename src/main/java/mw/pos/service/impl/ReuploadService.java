package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reuploadService")
public class ReuploadService implements IReuploadService {
	@Resource
	private ReuploadMapper reuploadMapper;

	public int insert(Reupload reupload){
		return reuploadMapper.insert(reupload);
	}
	public int insertSelective(Reupload reupload){
		return reuploadMapper.insertSelective(reupload);
	}
	public int deleteByPrimaryKey(String string){
		return reuploadMapper.deleteByPrimaryKey(string);
	}
	public Reupload selectByPrimaryKey(String string){
		return reuploadMapper.selectByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(Reupload reupload){
		return reuploadMapper.updateByPrimaryKeySelective(reupload);
	}
	public int updateByPrimaryKey(Reupload reupload){
		return reuploadMapper.updateByPrimaryKey(reupload);
	}


}
