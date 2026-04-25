package CreationalPatterns.Factory.FactoryMethod.Example;

abstract public class MessageCreator {
    public Message getMessage(){
        Message msg=createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }
    abstract public Message createMessage();
}
