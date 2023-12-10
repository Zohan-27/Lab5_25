import java.util.Scanner;

// Абстрактный класс Baseline
abstract class Baseline {
    protected String title;
    protected String content;
    protected String author;

    public Baseline(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public abstract void display();
    public abstract void publish();
}

// Интерфейс Readable
interface Readable {
    void read();
    void review();
    void like();
}

// Класс Behaviour расширяет Baseline и реализует интерфейс Readable
class Behaviour extends Baseline implements Readable {
    private String behaviorType;
    protected int analysisResult;

    public Behaviour(String title, String content, String author, String behaviorType, int analysisResult) {
        super(title, content, author);
        this.behaviorType = behaviorType;
        this.analysisResult = analysisResult;
    }

    @Override
    public void display() {
        System.out.println("Заголовок: " + title);
        System.out.println("Содержание: " + content);
        System.out.println("Тип поведения: " + behaviorType);
    }

    @Override
    public void publish() {
        System.out.println("Behaviour опубликован.");
    }

    @Override
    public void read() {
        System.out.println("Behaviour прочитан.");
    }

    @Override
    public void review() {
        System.out.println("Поведение рецензировано.");
    }

    @Override
    public void like() {
        System.out.println("Поставлен лайк за поведение.");
    }
}

// Класс Blog также расширяет Baseline и реализует интерфейс Readable
class Blog extends Baseline implements Readable {
    private String blogType;
    public String url;

    public Blog(String title, String content, String author, String blogType, String url) {
        super(title, content, author);
        this.blogType = blogType;
        this.url = url;
    }

    @Override
    public void display() {
        System.out.println("Заголовок: " + title);
        System.out.println("Содержание: " + content);
        System.out.println("Тип блога: " + blogType);
        System.out.println("URL: " + url);
    }

    @Override
    public void publish() {
        System.out.println("Blog опубликован.");
    }

    @Override
    public void read() {
        System.out.println("Blog прочитан.");
    }

    @Override
    public void review() {
        System.out.println("Блог рецензирован.");
    }

    @Override
    public void like() {
        System.out.println("Поставлен лайк за блог.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Введите данные Behaviour:");
            System.out.print("Заголовок: ");
            String behaviourTitle = scanner.nextLine();
            System.out.print("Содержание: ");
            String behaviourContent = scanner.nextLine();
            System.out.print("Автор: ");
            String behaviourAuthor = scanner.nextLine();
            System.out.print("Тип поведения: ");
            String behaviorType = scanner.nextLine();
            System.out.print("Результат анализа: ");
            int analysisResult = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nВведите данные Blog:");
            System.out.print("Заголовок: ");
            String blogTitle = scanner.nextLine();
            System.out.print("Содержание: ");
            String blogContent = scanner.nextLine();
            System.out.print("Автор: ");
            String blogAuthor = scanner.nextLine();
            System.out.print("Тип поведения: ");
            String blogBehaviorType = scanner.nextLine();
            System.out.print("Результат анализа: ");
            int blogAnalysisResult = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Тип блога: ");
            String blogType = scanner.nextLine();
            System.out.print("URL: ");
            String blogURL = scanner.nextLine();

            Behaviour behaviour = new Behaviour(behaviourTitle, behaviourContent, behaviourAuthor, behaviorType, analysisResult);
            Blog blog = new Blog(blogTitle, blogContent, blogAuthor, blogBehaviorType, blogURL);

            System.out.println();
            System.out.println("Информация об объекте Behaviour:");
            behaviour.display();
            behaviour.publish();
            behaviour.read();
            behaviour.review();
            behaviour.like();

            System.out.println();
            System.out.println("Информация об объекте Blog:");
            blog.display();
            blog.publish();
            blog.read();
            blog.review();
            blog.like();

            System.out.println("\nЖелаете продолжить?");
            System.out.println("1. Продолжить");
            System.out.println("2. Выйти");
            System.out.print("Введите ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice == 1);

        System.out.println("Программа завершена.");
    }
}
