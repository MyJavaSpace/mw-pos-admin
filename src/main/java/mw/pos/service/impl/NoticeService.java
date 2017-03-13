package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("noticeService")
public class NoticeService implements INoticeService {
	@Resource
	private NoticeMapper noticeMapper;

	public int insert(Notice notice){
		return noticeMapper.insert(notice);
	}
	public int insertSelective(Notice notice){
		return noticeMapper.insertSelective(notice);
	}
	public int deleteByPrimaryKey(Integer integer){
		return noticeMapper.deleteByPrimaryKey(integer);
	}
	public Notice selectByPrimaryKey(Integer integer){
		return noticeMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Notice notice){
		return noticeMapper.updateByPrimaryKeySelective(notice);
	}
	public int updateByPrimaryKey(Notice notice){
		return noticeMapper.updateByPrimaryKey(notice);
	}


}
