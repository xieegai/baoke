package com.baoke.api.domain.response;

import com.baoke.api.domain.response.base.BaseResponseParam;
import com.baoke.common.dto.base.BaseResultDto;

/**
 * 设置－保存用户性别
 * 
 * @author zdy
 * @date: 2018年7月9日 下午8:27:46
 */
public class SaveUserSexResponse extends BaseResponseParam {
	private static final long serialVersionUID = 1L;

	@Override
	public BaseResponseParam convert(BaseResultDto baseResultDto) {
		return this;
	}

}
