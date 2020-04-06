package Weekly.Contest183;

public class numSteps {
    public int numSteps(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);
        int num = 0;

        while (stringBuilder.length() != 1){
            if(stringBuilder.charAt(stringBuilder.length() - 1) == '0'){
                stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
            }else{
                add(stringBuilder);
            }
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new numSteps().numSteps("1111"));
    }

    private StringBuilder add(StringBuilder builder){

        if(builder.charAt(builder.length()-1)=='1'){
            boolean flag = true;
            for(int i = builder.length()-1 ; i>=1;i--){
                if(builder.charAt(i) == '1') {
                    builder.replace(i,i+1, "0");
                }else{
                    builder.replace(i,i+1, "1");
                    flag = false;
                    break;
                }
            }
            if(flag){
                builder.replace(0,1, "0");
                builder.insert(0,'1');
            }

        }else{
            builder.replace(builder.length()-1,builder.length(),"1");
        }

        return builder;

    }
}
