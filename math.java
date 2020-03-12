public class math extends Abstractly{
    //フィールドの設定
    private char ch;

    //コンストラクタの作成
    public math(char ch){
        this.ch = ch;
    }

    //メソッドの設定
    public void open(){
        System.out.println("++");
    }

    public void kumasan(){
        System.out.println(ch); //指定した文字列のみ作成
    }

    public void close(){
        System.out.println("--");
    }
}