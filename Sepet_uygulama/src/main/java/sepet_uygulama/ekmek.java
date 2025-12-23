package sepet_uygulama;

class ekmek extends Urun {
    String ekmek_turu;
    double gramaj;

    public ekmek(String urun_adi, double urun_fiyati,String ekmek_turu,double gramaj) {
        super(urun_adi, urun_fiyati);
        this.ekmek_turu = ekmek_turu;
        this.gramaj = gramaj;
    }
    
    @Override
    public double KDV_uygula(){
        return urun_fiyati;
    }
    
}
