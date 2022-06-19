package spring.boot.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author JYH
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2022/4/11 12:23
 */
@Component
@EnableScheduling
@Slf4j
public class ExampleTask {

    /**
     * 每天 00:00 点执行
     * 使用 corn 表达式，确定定时任务什么时候执行
     */
    @Scheduled(cron="0 0 0 1/1 * ?")
    public void exampleTask() {
        try {
            log.info("定时任务启动");
            log.info("--这是定时任务的执行内容--");
            log.info("定时任务结束");
        } catch (Exception e) {
            log.error("定时任务异常：" + e);
        }
    }
}
