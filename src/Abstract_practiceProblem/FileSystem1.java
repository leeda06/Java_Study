package Abstract_practiceProblem;
abstract class FileSystemElement{
    String name;
    int size;
    boolean isDirectory(){

    }

}
class File extends FileSystemElement{}
class Directory extends FileSystemElement{
    void addFile(File f){

    }
    void addDirectory(Directory d){

    }
}
public class FileSystem1 {
}
