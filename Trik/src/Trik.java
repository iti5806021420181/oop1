import java.util.Scanner;
public class Trik {
public static void main(String[] args) {
int lt=1,cen=0,rt=0,tmp,i;
String swap;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Value : ");
swap = scan.next();
for(i=0;i<swap.length();i++){
if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
tmp=lt;
lt=cen;
cen=tmp;
}else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
tmp=cen;
cen=rt;
rt=tmp;
}else{
tmp=lt;
lt=rt;
rt=tmp;
}
}
if(lt == 1) System.out.println("Coin is in lt glass");
else if(cen == 1) System.out.println("Coin is in cen glass");
else System.out.println("Coin is in rt glass");
}}
