import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num=1;
        while(true){
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectiry = file.isDirectory();
            if (!fileExists||isDirectiry){
                System.out.println("Файл не существует или указан путь к папке.");
                continue;
            }
            System.out.println("Путь указан верно. Это файл номер "+num);
            num++;
        }
    }
}
