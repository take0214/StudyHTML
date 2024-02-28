package app1;


public class UpperReader extends Reader{
    @Override
    public String changeText(String text) {
        return text.toUpperCase();
    }

    @Override
    public String fileRead(String filePath) {
        return super.fileRead(filePath);
    }
}
