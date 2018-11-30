import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Fz
 * @date 2018/11/13 15:25
 */
public class UniqueEmailAddresses {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        String localName;
        String domainName;
        for(String s:emails){
            localName=s.split("@")[0];
            domainName=s.split("@")[1];
            if(localName.contains(".")){
                localName=localName.replace(".","");
            }
            if(localName.contains("+")){
                localName=localName.substring(0,localName.indexOf('+'));
            }
            String temp=localName+"@"+domainName;
            set.add(temp);
            temp=null;
        }
        return set.size();
    }
}
