public class Main{
    public static void main(String[] args){
        Abstractly A1 = new math('A');
        Abstractly A2 = new Start("こんにちはくまさん");
        Abstractly A3 = new Start("くまさん！おはようございます！！");
        A1.expression();
        A2.expression();
        A3.expression();
    }
}