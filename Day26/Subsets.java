package Day26;

public class Subsets{

    static void subset(String s,String ans,int i){

        if(i==s.length()){

            System.out.println(ans);

            return;

        }

        subset(s,ans+s.charAt(i),i+1);

        subset(s,ans,i+1);

    }

    public static void main(String[] args){

        subset("ABC","",0);

    }

}