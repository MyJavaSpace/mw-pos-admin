package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("reuploadService")
public class ReuploadService implements IReuploadService {
	@Resource
	private reuploadMapper reuploadMapper;

	public int insert(reupload reupload){
		return reuploadMapper.insert(reupload);
	}
	public int insertSelective(reupload reupload){
		return reuploadMapper.insertSelective(reupload);
	}
	public reupload selectByPrimaryKey(String string){
		return reuploadMapper.selectByPrimaryKey(string);
	}
	public int deleteByPrimaryKey(String string){
		return reuploadMapper.deleteByPrimaryKey(string);
	}
	public int updateByPrimaryKeySelective(reupload reupload){
		return reuploadMapper.updateByPrimaryKeySelective(reupload);
	}
	public int updateByPrimaryKey(reupload reupload){
		return reuploadMapper.updateByPrimaryKey(reupload);
	}


}
