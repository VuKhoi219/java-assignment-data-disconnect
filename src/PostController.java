import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    ArrayList<PostList> postlists = new ArrayList<>();    Scanner sc = new Scanner(System.in);
    public void createPostList(){

        System.out.println("Creating Post List");
        System.out.println("Enter ID:");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Article title:");
        String title = sc.nextLine();
        System.out.println("Enter describe:");
        String desc = sc.nextLine();
        System.out.println("Enter avatar:");
        String avatar = sc.nextLine();
        System.out.println("Enter writer:");
        String writer = sc.nextLine();
        System.out.println("Enter date of writing:");
        String date = sc.nextLine();
        PostList postList = new PostList();
        postlists.add(postList);
        postList.setId(id);
        postList.setArticleTitle(title);
        postList.setDescribe(desc);
        postList.setWriter(writer);
        postList.setAvatar(avatar);
        postList.setDateofwriting(date);
    }
    public void showPostList(){
        System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Article title", "describe", "avatar", "writer", "date of writing");
        for(int i=0; i<postlists.size(); i++){
            PostList pl = postlists.get(i);
            System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", pl.getId(), pl.getArticleTitle(), pl.getDescribe(), pl.getAvatar(), pl.getWriter(), pl.getDateofwriting());

        }
    }
    public void searchPostList(){
        System.out.println("Enter ID:");
        long id = sc.nextLong();
        sc.nextLine();
        int key = -1;
        for(int i=0; i<postlists.size(); i++){
            PostList pl = postlists.get(i);
            if(pl.getId() == id){
                key = i;
                System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", "Id", "Article title", "describe", "avatar", "writer", "date of writing");
                System.out.printf("%-10s ||%-10s ||%-10s ||%-10s ||%-10s ||%-10s\n", pl.getId(), pl.getArticleTitle(), pl.getDescribe(), pl.getAvatar(), pl.getWriter(), pl.getDateofwriting());
            }
        }
        if (key == -1) {
            System.out.println("Post not found");
        }
    }
    public void deletePostList(){
        System.out.println("Enter ID:");
        long id = sc.nextLong();
        sc.nextLine();
        int key = -1;
        for(int i=0; i<postlists.size(); i++){
            PostList pl = postlists.get(i);
            if(pl.getId() == id){
                key = i;
                postlists.remove(i);
                System.out.println("Deleted Post List");
            }
        }
        if (key == -1) {
            System.out.println("Post not found");
        }
    }
}
