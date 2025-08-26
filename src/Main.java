import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class PostManager {
        
    public int engagementScore = 0;
    public String postRating = "";


    public int calculateEngagement(int... interactions) {

        if (interactions == null || interactions.length == 0) {
            return 0;
        }

        for (int sum : interactions) {
                engagementScore += sum;
        }

        return engagementScore;

    }
        
    public String getCategoryRating(int engagementScore) {

        if (engagementScore >= 1000) {
            postRating = "Viral";
        } else if (engagementScore >= 500) {
            postRating = "Popular";
        } else if (engagementScore >= 100) {
            postRating = "Good";
        } else if (engagementScore >= 50) {
            postRating = "Low";
        } else  {
            postRating = "Poor";
        }

        return postRating;

    }

    public ArrayList<String> manageHashtags(String[] hashtags) {

        Set<String> uniqueHashtags = new HashSet<>(Arrays.asList(hashtags));

        return new ArrayList<>(uniqueHashtags);

    }

    public LinkedList<String> findTrendingPost(arraylist<String> posts, HashMap<String, Integer> postEngagements) {
        
        LinkedList<String> trendingPosts = new LinkedList<>();

        for (String post : posts) {

            int engagementScore = postEngagement.getOrDefault(post, 0);

            if (engagementScore > 500) {

                trendingPosts.add(post);

            }
        }

        return trendingPosts;
    }   

    public HashSet<String> getUniqueAuthors(String... authors){
        return new HashSet<>(Arrays.asList(authors));
    }

        // Stats 
    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post Title: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);

    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post Title: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    
    }

}

public class Main {
    public static void main(String[] args) {

        PostManager Post = new PostManager();

        String postTitle = "Java Programming Tips";
        int engaement = Post.calculateEngagement(150, 75, 25);
        String category = Post.getCategoryRating(engaement);
        String[] authors = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        String[] Hashtags = {"#java", "#coding", "#programming", "#java", "#tips" };
        ArrayList<String> uniqueHashtags = Post.manageHashtags(Hashtags);

        ArrayList<String> Trending = new ArrayList<>(Arrays.asList("Advanced Java Tutorials", "Spring Boot Guide"));
        HashMap<String, Integer> postEngagement = new HashMap<>();

        HashSet<String> uniqueAuthors = Post.getUniqueAuthors(authors);

        postEngagement.put("Advanced Java Tutorials", 750);
        postEngagement.put("Spring Boot Guide", 600);

        // Without Category

        System.out.println("+++ Social Media Post Manager +++");
        Post.displayPostStats(postTitle, engaement);
        System.out.println("\nUnique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + Trending);
        System.out.println("Unique Authors: " + uniqueAuthors);


        // With Category

        System.out.println("\n+++ Social Media Post Manager +++");
        Post.displayPostStats(postTitle, engaement, category);
        System.out.println("\nUnique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + Trending);
        System.out.println("Unique Authors: " + uniqueAuthors);

    }
}
