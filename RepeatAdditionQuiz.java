import java.util.Scanner;
import java.util.ArrayList;
public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ArrayList<String> nlist=new ArrayList();
    int n1=(int)(Math.random()*10);
    int n2=(int)(Math.random()*10);
    System.out.println("What is "+n1+" * "+n2+" ?");
    int ans=input.nextInt();
    int x=0;//判斷某些程式是否有執行(以*表示)
    while(n1*n2!=ans) {
    	for(int i=0;i<nlist.size();i++) {
    		if(nlist.isEmpty()) {
    			System.out.println("Wrong answer. Please try again. What is "+n1+" * "+n2+" ?");
    			nlist.add(Long.toString(ans));
    			x++;
    			break;
    		}//*
    		if(Integer.parseInt(nlist.get(i))==ans) {
    			System.out.println("You already entered "+ans);
    			x++;
    		}//*
    	}
    	if(x==0) {
			System.out.println("Wrong answer. Please try again. What is "+n1+" * "+n2+" ?");
			nlist.add(Long.toString(ans));
		}//如果前面以*標示的程式有執行的話，這個程式就會執行
    	if(x>0) {
			x=0;
		}//不論x是否有變動都將其歸零
    	ans=input.nextInt();
    }
    System.out.println("You got it!");
  }
}
