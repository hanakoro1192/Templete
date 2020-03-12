public abstract class Abstractly{
    public abstract void open();

    public abstract void kumasan();

    public abstract void close();

    public final void expression(){
        open();
        for(int i =0; i < 10; i++){
            kumasan(); //ここで処理のくまさんを呼ぶ
        }
        close();
    }
}