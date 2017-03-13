package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("NoticeService")
public class NoticeService implements INoticeService {
	@Resource
	private NoticeMapper NoticeMapper;

	public int insert(Notice notice){
		return NoticeMapper.insert(notice);
	}
	public int insertSelective(Notice notice){
		return NoticeMapper.insertSelective(notice);
	}
	public int deleteByPrimaryKey(Integer integer){
		return NoticeMapper.deleteByPrimaryKey(integer);
	}
	public Notice selectByPrimaryKey(Integer integer){
		return NoticeMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Notice notice){
		return NoticeMapper.updateByPrimaryKey(notice);
	}
	public int updateByPrimaryKeySelective(Notice notice){
		return NoticeMapper.updateByPrimaryKeySelective(notice);
	}


}
