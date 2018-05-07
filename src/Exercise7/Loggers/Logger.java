package Exercise7.Loggers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Observer;

public abstract class Logger implements Observer {

    private BufferedWriter output;

    public Logger(String logPath) {
        File file = new File(logPath);
        try {
            output = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void writeToLog(String msg){
        try {
            output.write(msg);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    public void close() {
        if ( output != null ) {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
