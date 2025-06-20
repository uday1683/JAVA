package OnlineExaminationSystem;
import java.util.*;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }
}

class Question {
    String question;
    String[] options;
    char correctOption;

    public Question(String question, String[] options, char correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctOption;
    }

    public void display() {
        System.out.println(question);
        System.out.println("A. " + options[0]);
        System.out.println("B. " + options[1]);
        System.out.println("C. " + options[2]);
        System.out.println("D. " + options[3]);
    }

    public String getCorrectAnswer() {
        return correctOption + ". " + options[correctOption - 'A'];
    }
}

public class OnlineExaminationSystem {
    private static Scanner sc = new Scanner(System.in);
    private static User currentUser;
    private static List<Question> questions = new ArrayList<>();
    private static int score = 0;
    private static Map<Question, Character> userAnswers = new HashMap<>();

    public static void main(String[] args) {
        setupQuestions();
        System.out.println("==== Welcome to Online Examination System ====");
        login();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Start Exam");
            System.out.println("2. View Result");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    startExam();
                    break;
                case 2:
                    showResult();
                    break;
                case 3:
                    System.out.println("Logging out... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    private static void login() {
        System.out.print("Enter username: ");
        String uname = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();

        // Dummy login
        User user = new User("uday", "1234");

        if (uname.equals(user.getUsername()) && user.validatePassword(pass)) {
            currentUser = user;
            System.out.println("Login successful. Welcome " + uname + "!");
        } else {
            System.out.println("Invalid credentials. Exiting...");
            System.exit(0);
        }
    }

    private static void setupQuestions() {
        questions.clear();
        questions.add(new Question("Which language is platform independent?",
                new String[]{"C", "Python", "Java", "Assembly"}, 'C'));
        questions.add(new Question("What is the size of int in Java?",
                new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on OS"}, 'B'));
        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"super", "extends", "this", "implements"}, 'B'));
        questions.add(new Question("Which one is not a Java keyword?",
                new String[]{"static", "Boolean", "void", "try"}, 'B'));
        questions.add(new Question("Which method is the entry point of a Java program?",
                new String[]{"start()", "main()", "run()", "init()"}, 'B'));
    }

    private static void startExam() {
        score = 0;
        userAnswers.clear();
        sc.nextLine(); // clear input buffer

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ":");
            q.display();
            System.out.print("Your answer (A/B/C/D or S to skip): ");
            char answer = sc.nextLine().toUpperCase().charAt(0);

            if (answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D') {
                userAnswers.put(q, answer);
                if (q.isCorrect(answer)) {
                    score++;
                }
            } else {
                userAnswers.put(q, 'S'); // skipped
            }
        }

        System.out.println("\nExam completed!");
    }

    private static void showResult() {
        System.out.println("\n===== Result Summary =====");
        System.out.println("Total Questions: " + questions.size());
        System.out.println("Correct Answers: " + score);
        int wrong = 0, skipped = 0;

        for (Question q : questions) {
            char ans = userAnswers.getOrDefault(q, 'S');
            if (ans == 'S') skipped++;
            else if (!q.isCorrect(ans)) wrong++;
        }

        System.out.println("Wrong Answers: " + wrong);
        System.out.println("Skipped Questions: " + skipped);
        double percentage = (score * 100.0) / questions.size();
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + getGrade(percentage));

        System.out.println("\n----- Incorrect Answers Review -----");
        for (Question q : questions) {
            char userAns = userAnswers.getOrDefault(q, 'S');
            if (!q.isCorrect(userAns)) {
                System.out.println("\nQuestion: " + q.question);
                System.out.println("Your Answer: " + (userAns == 'S' ? "Skipped" : userAns));
                System.out.println("Correct Answer: " + q.getCorrectAnswer());
            }
        }
    }

    private static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 40) return "C";
        else return "Fail";
    }
}
