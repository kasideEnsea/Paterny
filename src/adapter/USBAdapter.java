package adapter;

public class USBAdapter implements IUSB {
    private ICard sdCard;

    public  USBAdapter(ICard card){
        this.sdCard = card;
    }
    @Override
    public String read() {
        return sdCard.read();
    }
}
