package com.palmelf.erp.serviceImpl;

import org.apache.log4j.jmx.LoggerDynamicMBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.Log4jLoggerFactory;

import com.palmelf.erp.service.BaseService;

/**
 * 类功能说明 TODO: 类修改者 修改日期 修改说明
 * <p>
 * Title: BaseServiceImpl.java
 * </p>
 * <p>
 * Description:福产流通科技
 * </p>
 * <p>
 * Copyright: Copyright (c) 2012
 * </p>
 * <p>
 * Company:福产流通科技
 * </p>
 * 
 * @author shouyin 756514656@qq.com
 * @date 2013-4-19 下午03:18:37
 * @version V1.0
 */
// @Service("baseService")
// @Transactional(readOnly = false, propagation = Propagation.REQUIRED,
// rollbackFor = Exception.class)
public class BaseServiceImpl implements BaseService {
	protected Logger logger = LoggerFactory.getLogger(getClass());

}
