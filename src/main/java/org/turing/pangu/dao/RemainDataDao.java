/**
 * 
 * Title：User
 * Copyright: Copyright (c) 2014
 * Company: 深电中心
 * @author axi
 * @version 1.0, 2016年08月22日 
 * @since 2016年08月22日 
 */

package org.turing.pangu.dao;

import java.util.List;

import org.turing.pangu.model.RemainData;

public interface RemainDataDao extends BaseDao<RemainData, Long> {
	public List<RemainData> selectTodayData(RemainData model);
}