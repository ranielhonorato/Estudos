import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(LocalDateTime.parse("02/03/2026 21:06:30", fmt1), "Travelling to New  Zealand", "I'm going to visit this wonderful country!", 12);

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome! ");
        post1.addComment(comment1);
        post1.addComment(comment2);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post2 = new Post(LocalDateTime.parse("02/03/2026 21:46:50", fmt2), "Good night guys", "See you tomorrow", 5);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.print(post1.toString());
        System.out.print(post2.toString());
    }

}