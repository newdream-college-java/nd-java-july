package 有参数方法第2次课;

public class Test医院 {
    public static void main(String[] args) {
        //1,一医院对象 3个医生对象
        医院类 yy = new 医院类();
        医生类 y1 = new 医生类();
        y1.name="王教授";
        y1.no="11";
        y1.ks="神经科";
        y1.zc="主任";
        
        医生类 y2 = new 医生类();
        
        y2.name="谢教授";
        y2.no="23";
        y2.ks="畜生科";
        y2.zc="主治医生";
        
        //2.使用对象
        yy.addDoctor(y1);
        yy.addDoctor(y2);
        
    }
}   
