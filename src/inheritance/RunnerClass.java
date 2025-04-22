package inheritance;

public class RunnerClass {
    public static void main(String[] args) {
        chromeClass c1=new chromeClass();
        c1.startBrowser();
        c1.startBrowser();
        CommonMethods c2=new chromeClass();


        c2.closeTab();
    }
}
