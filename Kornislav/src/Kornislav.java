import java.util.Scanner;
public class Kornislav {
public static void main(String[] args) {
int v1,v2,v3,v4,tmp;
Scanner scan = new Scanner(System.in);
System.out.print("Input Value_1 : ");
v1=scan.nextInt();
System.out.print("Input Value_2 : ");
v2=scan.nextInt();
System.out.print("Input Value_3 : ");
v3=scan.nextInt();
System.out.print("Input Value_4 : ");
v4=scan.nextInt();
if(v1>v2){
tmp=v1;
v1=v2;
v2=tmp;
}
if(v1>v3){
tmp=v1;
v1=v3;
v3=tmp;
}
if(v1>v4){
tmp=v1;
v1=v4;
v4=tmp;
}
if(v2>v3){
tmp=v2;
v2=v3;
v3=tmp;
}
if(v2>v4){
tmp=v2;
v2=v4;
v4=tmp;
}
if(v3>v4){
tmp=v3;
v3=v4;
v4=tmp;
}
System.out.print("\nRectangle Area = : "+""+v3+""+" * "+v1+" = "+v3*v1);
}}
