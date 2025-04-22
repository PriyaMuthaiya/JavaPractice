package inheritance;

public class chromeClass extends CommonMethods{

void runningChrome(){
    startBrowser();
    closeBrowser();

}
    @Override
    void closeTab(){
        System.out.println("clsoing tab2");
    }

}
