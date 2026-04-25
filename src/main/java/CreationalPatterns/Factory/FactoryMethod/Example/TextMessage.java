package CreationalPatterns.Factory.FactoryMethod.Example;

public class TextMessage extends Message{
    @Override
    public String getContent(){
        return "text message content";
    }
}
