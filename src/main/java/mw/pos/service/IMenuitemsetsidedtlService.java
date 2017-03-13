package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemsetsidedtlService {
	int insert(Menuitemsetsidedtl menuitemsetsidedtl);
	int deleteByPrimaryKey(MenuitemsetsidedtlKey menuitemsetsidedtlKey);
	int updateByPrimaryKey(Menuitemsetsidedtl menuitemsetsidedtl);
	Menuitemsetsidedtl selectByPrimaryKey(MenuitemsetsidedtlKey menuitemsetsidedtlKey);
	int insertSelective(Menuitemsetsidedtl menuitemsetsidedtl);
	int updateByPrimaryKeySelective(Menuitemsetsidedtl menuitemsetsidedtl);

}
