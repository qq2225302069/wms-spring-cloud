package wms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//用来启动eureka服务
@EnableEurekaServer
public class EurekaApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
