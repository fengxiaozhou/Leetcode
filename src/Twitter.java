import java.util.*;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-04-13
 */
public class Twitter {

    List<text> TList;

    Map<Integer, Set<Integer>> followMap;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {

        TList = new ArrayList<>();

        followMap = new HashMap<>();

    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {

        TList.add(new text(userId, tweetId));
        follow(userId,userId);

    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {

        if (TList == null || TList.size() == 0) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();
        for (int i = TList.size() - 1; i >= 0 && res.size() < 10; i--) {

            if (TList.get(i).user == userId || ( followMap.get(userId)!=null && followMap.get(userId).size()!=0 && followMap.get(userId).contains(TList.get(i).user))) {
                res.add(TList.get(i).textId);
            }
        }
        return res;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (!followMap.containsKey(followerId)) {
            Set<Integer> set = new HashSet<>();
            set.add(followeeId);
            followMap.put(followerId, set);
        } else {
            followMap.get(followerId).add(followeeId);
        }
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {

        if (!followMap.containsKey(followerId)) {
            return;
        } else {
            followMap.get(followerId).remove(followeeId);
        }
    }

    class text {

        Integer user;
        Integer textId;

        public text() {
        }
        ;

        public text(Integer user, Integer textId) {
            this.user = user;
            this.textId = textId;
        }
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 1);
        twitter.getNewsFeed(1);
        twitter.follow(2, 1);
        twitter.getNewsFeed(2);
        twitter.unfollow(2, 1);
        twitter.getNewsFeed(2);
    }
}
//["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed","unfollow","getNewsFeed"]
//        [[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
//["Twitter","postTweet","getNewsFeed","follow","getNewsFeed","unfollow","getNewsFeed"]
//        [[],[1,1],[1],[2,1],[2],[2,1],[2]]