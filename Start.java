public class Start extends Abstractly{
    //フィールドの設定
    private String cafevan; 
    private int width;

    //コンストラクタの設定
    public Start(String string){
        this.cafevan = string;
        this.width = cafevan.getBytes().length;
    }

    public void open(){
        display();
    }

    public void kumasan(){
        System.out.println("**" + cafevan + "**");
    }

    public void close(){
        display();
    }

    public void display(){
        System.out.println("**");
        for(int i = 0; i < width; i++){
            System.out.println("*");
        }
        System.out.println("**");
    }
}