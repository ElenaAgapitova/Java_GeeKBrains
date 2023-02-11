package lections;


public class lec2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // API сторонний сервис для работы, на основе что-то можно сделать, например телеграм API
        // Мы смотрим, что предлагали сторонние, сервисы, а что предлагает джава...
        // Возможности, которые предлагаю разработчики для работы с языком

        // Работа со строками
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+"); // 9 ms, если str+="+" 40 ms
        }

        // File<name> = new File(<full way to file>)
        // File f1 = new File("file_lec1.txt"); относительный путь
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt"); абсолютный путь
        /*
         * import java.io.File;
        public class fileSystemDemo {
            public static void main(String[] args) {
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/file.txt");
                File f3 = new File(pathFile);
                System.out.println(f3.getAbsolutePath ());
                // /Users/sk/vscode/java_projects/file.txt
                // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
            }
        }
         */
    }
}
