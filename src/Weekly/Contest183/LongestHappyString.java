package Weekly.Contest183;

public class LongestHappyString {

    public String longestDiverseString(int a, int b, int c) {

        StringBuilder res = new StringBuilder();

        String flag = "";
        while(!((a==0&&b==0)||(a==0&&c==0)||(b==0&&c==0))){
            if(a>2 && !flag.equals("a")){
                res.append("aa");
                flag = "a";
                a-=2;
                continue;
            }
            if(b>2 && !flag.equals("b")){
                res.append("bb");
                flag = "b";
                b-=2;
                continue;
            }
            if(c>2 && !flag.equals("c")){
                res.append("cc");
                flag="c";
                c-=2;
                continue;
            }
            if(a>=1 && !flag.equals("a")){
                res.append("a");
                flag = "a";
                a-=1;
                continue;
            }
            if(b>=1 && !flag.equals("b")){
                res.append("b");
                flag = "b";
                b-=1;
                continue;
            }
            if(c>=1 && !flag.equals("c")){
                res.append("c");
                flag="c";
                c-=1;
                continue;
            }
        }
        if(a>0){
            if(a>1){
                res.append("aa");
            }else{
                res.append("a");
            }
        }
        if(b>0){
            if(b>1){
                res.append("bb");
            }else{
                res.append("b");
            }
        }
        if(c>0){
            if(c>1){
                res.append("cc");
            }else{
                res.append("c");
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LongestHappyString().longestDiverseString(1, 1, 7));
    }

}
