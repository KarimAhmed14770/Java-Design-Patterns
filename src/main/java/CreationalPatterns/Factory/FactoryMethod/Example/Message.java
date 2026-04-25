package CreationalPatterns.Factory.FactoryMethod.Example;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders(){
        //add default headers
    }
    public void encrypt(){
        //encrypt the message
    }

}
