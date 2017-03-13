package mw.pos.service;

import com.pos.entity.*;

public interface IMenuitemsetsidedtlService {
	int insert(menuitemsetsidedtl menuitemsetsidedtl);
	menuitemsetsidedtl selectByPrimaryKey(menuitemsetsidedtlKey menuitemsetsidedtlKey);
	int updateByPrimaryKeySelective(menuitemsetsidedtl menuitemsetsidedtl);
	int deleteByPrimaryKey(menuitemsetsidedtlKey menuitemsetsidedtlKey);
	int updateByPrimaryKey(menuitemsetsidedtl menuitemsetsidedtl);
	int insertSelective(menuitemsetsidedtl menuitemsetsidedtl);

}
