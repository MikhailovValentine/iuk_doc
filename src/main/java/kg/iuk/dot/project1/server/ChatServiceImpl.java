package kg.iuk.dot.project1.server;

import kg.iuk.dot.project1.ChatService;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
  @Override
  public String getMessage() {
    return "Test Chat Message";
  }
}
