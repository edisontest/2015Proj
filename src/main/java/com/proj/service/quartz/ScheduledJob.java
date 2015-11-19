package com.proj.service.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob extends QuartzJobBean{

	private AnotherBean anotherBean;
	
	@Override
	protected void executeInternal(JobExecutionContext pArg0) throws JobExecutionException {
		anotherBean.printAnotherMessage();
	}
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
}
