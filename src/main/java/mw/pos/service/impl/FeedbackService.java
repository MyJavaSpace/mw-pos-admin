package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("feedbackService")
public class FeedbackService implements IFeedbackService {
	@Resource
	private FeedbackMapper feedbackMapper;

	public int insert(Feedback feedback){
		return feedbackMapper.insert(feedback);
	}
	public int insertSelective(Feedback feedback){
		return feedbackMapper.insertSelective(feedback);
	}
	public int deleteByPrimaryKey(Integer integer){
		return feedbackMapper.deleteByPrimaryKey(integer);
	}
	public Feedback selectByPrimaryKey(Integer integer){
		return feedbackMapper.selectByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(Feedback feedback){
		return feedbackMapper.updateByPrimaryKeySelective(feedback);
	}
	public int updateByPrimaryKey(Feedback feedback){
		return feedbackMapper.updateByPrimaryKey(feedback);
	}


}
