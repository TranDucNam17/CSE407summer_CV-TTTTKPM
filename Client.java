public class Client {
    private ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void doSomething(String data) {
        clientInterface.method(data);
    }
}
