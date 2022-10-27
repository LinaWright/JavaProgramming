package homework_practices.canvas;

import java.util.ArrayList;

public class Module {
    ArrayList<File> files;

    public Module() {
        this.files = new ArrayList<>();
    }

    public Module(ArrayList<File> files){
        this();
        this.files.addAll(files);
    }

    public void addFile(File file){
        files.add(file);
    }

    public void removeFile(File file){
        files.remove(file);
    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
}
