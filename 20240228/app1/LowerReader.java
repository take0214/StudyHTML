package app1;


public class LowerReader extends Reader{
    @Override
    public String changeText(String text) {
        return text.toLowerCase();
    }

    @Override
    public String fileRead(String filePath) {
        return super.fileRead(filePath);
    }
}
