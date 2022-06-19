package spring.boot.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author JYH
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2022/3/2 21:19
 * @ConfigurationProperties(prefix = "globalonstants")
 */

@Component
public class VarsUtil {

    /**
     * 文件保存目录，物理路径
     */
    public static String rootPath;

    /**
     * 允许最大单个文件最大值
     */
    public static String maxUploadSize;

    /**
     * 允许请求最大值
     */
    public static String maxRequestSize;

    @Value("${cbs.fileDirRoot}")
    public void setUserName(String rootPath) {
        VarsUtil.rootPath = rootPath;
    }

    @Value("${spring.servlet.multipart.max-file-size}")
    public void setMaxUploadSize(String maxUploadSize) {
        VarsUtil.maxUploadSize = maxUploadSize;
    }

    @Value("${spring.servlet.multipart.max-request-size}")
    public void setMaxRequestSize(String maxRequestSize) {
        VarsUtil.maxRequestSize = maxRequestSize;
    }

}
