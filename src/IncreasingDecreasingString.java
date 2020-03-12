/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-07
 */
public class IncreasingDecreasingString {

    public  String sortString(String s) {

        char[] arr = new char[26];

        String res = "";

        if(s.length()<=0){
            return "";
        }

        for(int i = 0 ; i<s.length() ;i++){

            int num = s.charAt(i) - 'a';

            arr[num]++;

        }


        while (res.length()<s.length()){
            res = front(arr,res);
            if(res.length()==s.length()){
                return res;
            }
            res = behind(arr,res);
            if(res.length()==s.length()){
                return res;
            }
        }

        return res;
    }

    public  String front(char[] arr , String res){

        for(int i =0 ; i < 26 ; i++){
            if(arr[i]>0){
                char temp = (char)('a'+i);
                res = res+temp;
                arr[i]--;
            }
        }
        return res;
    }

    public  String behind(char[] arr , String res){

        for(int i = 25 ; i >= 0 ; i--){
            if(arr[i]>0){
                char temp = (char)('a'+i);
                res = res+temp;
                arr[i]--;
            }
        }
        return res;
    }







}
