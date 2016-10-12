package kg.iuk.dot.project1.client;

import kg.iuk.dot.project1.ChatService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientConfiguration {
  @Bean
  public ChatService createChatService() {
    RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
    rmiProxyFactoryBean.setServiceUrl(String.format("rmi://localhost:%d/%s",
            ChatService.RMI_SERVICE_PORT, ChatService.RMI_SERVICE_NAME));
    rmiProxyFactoryBean.setServiceInterface(ChatService.class);
    rmiProxyFactoryBean.afterPropertiesSet();
    return (ChatService) rmiProxyFactoryBean.getObject();
  }
}
