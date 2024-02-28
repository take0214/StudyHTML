package app1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public abstract class Reader {

    abstract public String changeText(String text);

    public String fileRead(String filePath) {

        String content = "";
        try {
            File file = new File(filePath);
            if (file.exists()) {
                FileReader fr = new FileReader(file);

                // BufferedReaderを使うことで一行ずつ読み込める
                BufferedReader br = new BufferedReader(fr);
                
                String line;
                while ((line = br.readLine()) != null) {
                    content += line;
                }
                br.close();
            }
        } catch (Exception e) {
            System.out.println("エラーです");
        }

        return content;
    }
}
