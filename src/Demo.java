public class Demo {
    private int x;
    private int y;

    public void setData(int a, int b){
        x=a;
        y=b;
    }
    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void info(){
        System.out.println(x+","+y);
    }
    
}
