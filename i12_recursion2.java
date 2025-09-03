
public class i12_recursion2 {

    public static void hanoiTower(int n,String src, String hlpr, String dest ){
        if(n==1){
            System.out.println("transfer disk "+ n + " from "+ src +" to " + dest);
            return;
        }
        hanoiTower(n-1, src, dest,hlpr);
        System.out.println("transfer disk "+ n + " from "+ src +" to " + dest);
        hanoiTower(n-1, hlpr,src, dest);
    }
    public static void main(){
        int n=5;
        hanoiTower(n, "S", "H", "D");
    }
}
