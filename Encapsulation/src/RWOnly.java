public class RWOnly {
    private String name;
    public void writeOnly(String name){
        this.name=name;
    }
    public void readOnly(){
        System.out.println(this.name);
    }
}
