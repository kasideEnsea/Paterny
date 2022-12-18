package adapter;

public class SDCard implements ICard {
    @Override
    public String read() {
        return "Секретные данные с карты памяти";
    }
}
