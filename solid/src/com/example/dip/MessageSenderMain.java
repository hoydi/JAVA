package com.example.dip;

//고수준 모듈의 인터페이스
interface MessageService{
    public void sendMessage(String message);
}

//저수준 모듈의 구체적인 구현클래스
class EmailService implements MessageService{
    public void sendMessage(){

    }
    public void sendMessage(String message){
        System.out.println(message);
    }
}

class SMSService implements MessageService{
    public void sendMessage(){

    }
    public void sendMessage(String message){
        System.out.println(message);
    }
}

//고수준모듈
class MessageSender{
    private final MessageService messageService;

    //의존성주입을통해저수준모듈에의존
    public MessageSender(MessageService messageService){
        this.messageService = messageService;
    }
    public void send(String message){
        //메세지전송을인터페이스에의존
        messageService.sendMessage(message);
    }
}



public class MessageSenderMain {
    public static void main(String[] args) {
        //의존성주입을통해구체적인구현이아닌인터페이스에의존
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();
        MessageSender sender1 = new MessageSender(smsService);
        sender1.send("안녕하세요");
        MessageSender sender2 = new MessageSender(smsService);
        sender2.send("반갑습니다");
    }
}
