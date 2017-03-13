package mw.pos.service;

import com.pos.entity.*;

public interface IFeedbackService {
	int insert(feedback feedback);
	feedback selectByPrimaryKey(Integer integer);
	int updateByPrimaryKeySelective(feedback feedback);
	int deleteByPrimaryKey(Integer integer);
	int updateByPrimaryKey(feedback feedback);
	int insertSelective(feedback feedback);

}
