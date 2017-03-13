package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("noticeService")
public class NoticeService implements INoticeService {
	@Resource
	private noticeMapper noticeMapper;

	public int insert(notice notice){
		return noticeMapper.insert(notice);
	}
	public int insertSelective(notice notice){
		return noticeMapper.insertSelective(notice);
	}
	public notice selectByPrimaryKey(Integer integer){
		return noticeMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return noticeMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(notice notice){
		return noticeMapper.updateByPrimaryKeySelective(notice);
	}
	public int updateByPrimaryKey(notice notice){
		return noticeMapper.updateByPrimaryKey(notice);
	}


}
