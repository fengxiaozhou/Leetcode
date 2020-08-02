package Weekly.Contest192;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    List<String> linkedList;
    int currentIndex;

    public BrowserHistory(String homepage) {
        linkedList = new ArrayList<>();
        linkedList.add(homepage);
        currentIndex = 0;
    }

    public void visit(String url) {
        if(currentIndex<linkedList.size()){
            linkedList =  linkedList.subList(0,currentIndex+1);
        }
        currentIndex++;
        linkedList.add(url);
    }

    public String back(int steps) {
        if(currentIndex-steps>=0){
            currentIndex = currentIndex-steps;
        }else{
            currentIndex = 0;
        }
        return linkedList.get(currentIndex);
    }

    public String forward(int steps) {
        if(currentIndex+steps<linkedList.size()){
            currentIndex = currentIndex+steps;
        }else{
            currentIndex = linkedList.size()-1;
        }
        return linkedList.get(currentIndex);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");      // 你原本在浏览 "facebook.com" 。访问 "youtube.com"
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.forward(1));
        browserHistory.visit("linkedin.com");     // 你原本在浏览 "facebook.com" 。 访问 "linkedin.com"
        System.out.println(browserHistory.forward(2));
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.back(7));
    }

}
