        import java.util.*;
public class ChessboardSum {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int black=0,white=0;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
int x=sc.nextInt();
if((i+j)%2==0) black+=x;
else white+=x;
}
}
System.out.println(black);
System.out.print(white);
}
}
    

