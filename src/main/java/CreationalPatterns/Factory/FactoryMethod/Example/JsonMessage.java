package CreationalPatterns.Factory.FactoryMethod.Example;

public class JsonMessage extends Message{
    @Override
    public String getContent(){
        return "Json message content";
    }
}
