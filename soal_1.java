public class no1 {
    public static void main(String[] args){
        int angka1, angka2, maks;
        angka1 = 10;
        angka2 = 300;
        maks = 0;
        if (angka1>angka2) {
            maks = angka1;
        } else if (angka2>angka1){
            maks = angka2;
        }
        System.out.println("Angka maksimum adalah= "+maks);
    }
}
