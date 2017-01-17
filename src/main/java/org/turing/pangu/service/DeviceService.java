package org.turing.pangu.service;



import java.util.Date;
import java.util.List;

import org.turing.pangu.controller.phone.request.ReportReq;
import org.turing.pangu.model.Device;

/** InvestService */
public interface DeviceService extends BaseService<Device, Long> {
	public boolean saveReport(ReportReq req, boolean isRemainIp);
	public List<Device> selectCanRemainData(Device device);

}