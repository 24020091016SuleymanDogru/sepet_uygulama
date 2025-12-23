package sepet_uygulama;

public class Urun {

    String urun_adi;
    double urun_fiyati;
    
    public Urun(String urun_adi,double urun_fiyati){
        this.urun_adi = urun_adi;
        this.urun_fiyati = urun_fiyati;
    }
    
    public double KDV_uygula(){
        return urun_fiyati * 1.20;
    }
    
}
