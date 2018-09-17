package devutility.test.app.quartz.config;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfiguration {
	@Bean
	public Scheduler scheduler() throws SchedulerException {
		return StdSchedulerFactory.getDefaultScheduler();
	}
}