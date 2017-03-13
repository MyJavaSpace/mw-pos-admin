package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemaskgpService {
	int insert(Menuitemaskgp menuitemaskgp);
	int deleteByPrimaryKey(MenuitemaskgpKey menuitemaskgpKey);
	int updateByPrimaryKey(Menuitemaskgp menuitemaskgp);
	Menuitemaskgp selectByPrimaryKey(MenuitemaskgpKey menuitemaskgpKey);
	int insertSelective(Menuitemaskgp menuitemaskgp);
	int updateByPrimaryKeySelective(Menuitemaskgp menuitemaskgp);

}
