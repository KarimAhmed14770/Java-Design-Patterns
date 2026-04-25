package CreationalPatterns.Factory.FactoryMethod.Example;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
