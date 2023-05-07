public class _13 {
    public static void main(String args[]){
        for(int i=1;i<100;i++){
            int clap =0;
            int ten = i/10;
            int one = i%10;
            if(ten%3==0&&ten!=0){
                clap++;
            }
            if(one%3==0&&one!=0){
                clap++;
            }
            if(clap==2){
                System.out.printf("%d 박수 짝짝\n",i);
            }else if(clap==1){
                System.out.printf("%d 박수 짝\n",i);
            }
        }
    }
}
