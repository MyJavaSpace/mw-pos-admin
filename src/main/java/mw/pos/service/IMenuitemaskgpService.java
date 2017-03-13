package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemaskgpService {
	int insert(menuitemaskgp menuitemaskgp);
	menuitemaskgp selectByPrimaryKey(menuitemaskgpKey menuitemaskgpKey);
	int updateByPrimaryKeySelective(menuitemaskgp menuitemaskgp);
	int deleteByPrimaryKey(menuitemaskgpKey menuitemaskgpKey);
	int updateByPrimaryKey(menuitemaskgp menuitemaskgp);
	int insertSelective(menuitemaskgp menuitemaskgp);

}
