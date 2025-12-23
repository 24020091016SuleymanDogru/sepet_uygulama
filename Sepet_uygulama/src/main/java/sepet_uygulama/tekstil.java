package sepet_uygulama;

class tekstil extends Urun {
    
    String kumas_turu;
    String beden;
    String uretici;

    public tekstil(String urun_adi, double urun_fiyati,String kumas_turu,String beden,String uretici) {
        super(urun_adi, urun_fiyati);
        this.kumas_turu = kumas_turu;
        this.beden = beden;
        this.uretici = uretici;
        
    }
    
    @Override
    public double KDV_uygula(){
        return urun_fiyati * 1.10;
    }
    
    
}
