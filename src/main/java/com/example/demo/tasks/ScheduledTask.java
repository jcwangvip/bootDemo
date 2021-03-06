package com.example.demo.tasks;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:quartz.properties")
public class ScheduledTask {

	@Scheduled(fixedRate = 5000)
	public void scheduledTask() {
		String ce = "adf";
		System.out.println("sdf-测试一下git操作----+" + ce + "-");
		System.out.println("sdf-测试一下git操作-zxcv----");
		System.out.println("又提交一次");
	}

	@Scheduled(cron = "0 */1 *  * * * ")
	public void scheduledTaskOrCron() {

		System.out.println("gogogo----------");
	}

	@Scheduled(cron = "${jobs.schedule}")
	public void scheduledTaskOrCron1() {

		System.out.println("12345y678----------");
	}
}