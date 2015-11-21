package outils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Vic on 21/11/2015.
 */
public class FileHandler {

    public static FileHandler STATIC_ACCESS;
    static final String DEFAULT_FILE_NAME = "output";
    private PrintWriter printWriter;

    public  FileHandler(String type)  {
        try {
            this.printWriter = new PrintWriter(DEFAULT_FILE_NAME+"."+type,"UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        this.giveStaticAccess();

    }

    private void giveStaticAccess() {
        STATIC_ACCESS = this;
    }

    public void ecrireDansFichier(String content){
        this.printWriter.println(content);
    }


    public void close() {
        printWriter.close();
    }
}
