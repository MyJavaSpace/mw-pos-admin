package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("FeedbackService")
public class FeedbackService implements IFeedbackService {
	@Resource
	private FeedbackMapper FeedbackMapper;

	public int insert(Feedback feedback){
		return FeedbackMapper.insert(feedback);
	}
	public int insertSelective(Feedback feedback){
		return FeedbackMapper.insertSelective(feedback);
	}
	public int deleteByPrimaryKey(Integer integer){
		return FeedbackMapper.deleteByPrimaryKey(integer);
	}
	public Feedback selectByPrimaryKey(Integer integer){
		return FeedbackMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKey(Feedback feedback){
		return FeedbackMapper.updateByPrimaryKey(feedback);
	}
	public int updateByPrimaryKeySelective(Feedback feedback){
		return FeedbackMapper.updateByPrimaryKeySelective(feedback);
	}


}
