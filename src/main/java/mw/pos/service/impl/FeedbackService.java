package mw.pos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pos.entity.*;
import mw.pos.service.*;
import com.pos.dao.*;

@Service("feedbackService")
public class FeedbackService implements IFeedbackService {
	@Resource
	private feedbackMapper feedbackMapper;

	public int insert(feedback feedback){
		return feedbackMapper.insert(feedback);
	}
	public int insertSelective(feedback feedback){
		return feedbackMapper.insertSelective(feedback);
	}
	public feedback selectByPrimaryKey(Integer integer){
		return feedbackMapper.selectByPrimaryKey(integer);
	}
	public int deleteByPrimaryKey(Integer integer){
		return feedbackMapper.deleteByPrimaryKey(integer);
	}
	public int updateByPrimaryKeySelective(feedback feedback){
		return feedbackMapper.updateByPrimaryKeySelective(feedback);
	}
	public int updateByPrimaryKey(feedback feedback){
		return feedbackMapper.updateByPrimaryKey(feedback);
	}


}
