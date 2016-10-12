package kg.iuk.dot.project1.client;

import kg.iuk.dot.project1.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class ChatClient {
  private final ChatService service;

  @Autowired
  public ChatClient(ChatService service) {
    this.service = service;
  }

  @PostConstruct
  public void userChatService() {
    System.out.println(service.getMessage());
  }
}
