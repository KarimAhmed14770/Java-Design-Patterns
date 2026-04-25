package CreationalPatterns.Factory.FactoryMethod.Example;

public class JsonMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
