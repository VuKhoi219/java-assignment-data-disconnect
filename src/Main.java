import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        choice();
    }
    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        PostController function1 = new PostController();
        function1.createPostList();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your selection");
            System.out.println("1. Create Post");
            System.out.println("2. Show Post");
            System.out.println("3. Search Post");
            System.out.println("4. Delete Post");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    function1.createPostList();
                    break;
                case 2:
                    function1.showPostList();
                    break;
                case 3:
                    function1.searchPostList();
                    break;
                case 4:
                    function1.deletePostList();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}