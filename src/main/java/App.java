import java.io.File;
import java.io.IOException;

public class App {
  public static void main(String[] args) {
    // try {
    //   File f = File.createTempFile("pre", ".tmp");
    //   System.out.println("Done!");
    //   System.out.println(f.getAbsolutePath());
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    // File[] files = File.listRoots();
    // for (File f : files) {
    //   System.out.println(f.getAbsolutePath());
    // }

    // File f = new File("/Users/nndkhoa/Downloads/CV NHNN VN 6.2.2018.pdf");
    // if (f.exists())
    //   System.out.println(f.getAbsolutePath());

    // File f = new File("test.txt");
    // if (!f.exists()) {
    //   try {
    //     if (f.createNewFile()) {
    //       System.out.println(f.getAbsolutePath());
    //       System.out.println("Created!");
    //     }
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    // } else {
    //   if(f.delete()) System.out.println("deleted");
    // }

    String workdirPath = System.getProperty("user.dir");
    System.out.format("Workdir = `%s`\n", workdirPath);

    // File dir = new File("dir/java/io");
    // dir.mkdirs();

    File workdir = new File(workdirPath);
    // String[] list = workdir.list();
    // for (String str : list) {
    //   System.out.println(str);
    // }

    // File[] listFiles = workdir.listFiles();
    // for (File file : listFiles) {
    //   System.out.print(file.getPath());
    //   System.out.print(" => ");
    //   System.out.println(file.isDirectory() ? "Folder" : "File");
    // }

    // liệt kê danh sách các tập tin có trong thư mục hiện hành, kể cả các file trong thư mục con
    listFileInDir(workdir);

    // liệt kê cây-thư-mục của thư mục hiện hành


  }

  private static void listFileInDir(File dir) {
    File[] listFiles = dir.listFiles();
    for (File file : listFiles) {
      if (file.isFile()) {
        if (file.getName().compareTo(".DS_Store") != 0)
          System.out.println(file.getName());
      } else listFileInDir(file);
    }
  }
}
