package mw.pos.service;

import com.pos.entity.*;

public interface IFeedbackService {
	int insert(Feedback feedback);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(Feedback feedback);
	Feedback selectByPrimaryKey(Integer integer);
	int insertSelective(Feedback feedback);
	int updateByPrimaryKeySelective(Feedback feedback);

}
