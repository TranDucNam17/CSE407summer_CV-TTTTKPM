public class Adapter implements ClientInterface {
    private Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    private String convertToServiceFormat(String data) {
        // Giả sử cần chuyển đổi dữ liệu cho đúng định dạng Service yêu cầu
        return "[Adapted] " + data;
    }

    @Override
    public void method(String data) {
        String specialData = convertToServiceFormat(data);
        adaptee.serviceMethod(specialData);
    }
}
