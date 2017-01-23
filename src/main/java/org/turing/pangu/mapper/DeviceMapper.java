package org.turing.pangu.mapper;

import java.util.List;

import org.turing.pangu.model.Device;

 /**AppMapper*/
 public interface DeviceMapper extends BaseMapper<Device,Long>{
	 public List<Device> selectTimeSpan(Device device);
	 public int selectCountByTimeSpan(Device device);
	 
 }
 

