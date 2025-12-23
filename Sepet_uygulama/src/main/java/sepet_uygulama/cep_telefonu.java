package sepet_uygulama;

class cep_telefonu extends Urun {
    
    String marka;
    String model;
    
    
    public cep_telefonu(String urun_adi, double urun_fiyati,String marka,String model) {
        super(urun_adi, urun_fiyati);
        this.marka = marka;
        this.model = model;
    }
    
    @Override
    public double KDV_uygula(){
        return urun_fiyati * 1.18;
    }
}
