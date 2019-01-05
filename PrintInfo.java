public class PrintInfo {

    Bean bean;

    public PrintInfo(Bean bean) {
        this.bean = bean;
    }

    public void print(){
        System.out.print(bean.getId());
    }
}
