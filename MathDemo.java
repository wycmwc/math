import java.util.Scanner;

public class MathDemo{
    public static void main(String[] args){
        //键盘录入开始，结束的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始的数据：");
        int start = sc.nextInt();

        System.out.println("请输入结束的数据：");
        int end = sc.nextInt();
        //10表示准备输出随机数的个数是10个
        for(int x = 0; x< 100 ; x++){
            // 调用方法
            int num = getRandom(start,end);
            //输出
            System.out.println(num);
        }
    }
    public static int getRandom(int start, int end){
        int number = (int)(Math.random()*(end-start+1))+start;
        return number;
    }
}


