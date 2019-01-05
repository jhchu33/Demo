public class DebugDemo {

    InfoBean infoBean = new InfoBean(1,"wangwei","male",25);

    public void main(String args[]){
        PrintInfo printInfo = new PrintInfo(infoBean);
        printInfo.print();
    }
}
