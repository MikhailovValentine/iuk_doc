package kg.iuk.dot.project1.server;

import kg.iuk.dot.project1.ChatService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
@ComponentScan
public class ServerConfiguration {
    @Bean
    public RmiServiceExporter registerService(ChatService service) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName(ChatService.RMI_SERVICE_NAME);
        rmiServiceExporter.setService(service);
        rmiServiceExporter.setServiceInterface(ChatService.class);
        rmiServiceExporter.setRegistryPort(ChatService.RMI_SERVICE_PORT);
        return rmiServiceExporter;
    }
}
