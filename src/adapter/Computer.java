package adapter;

public class Computer {
    public static String getData(IUSB usb){
        return usb.read();
    }
}
