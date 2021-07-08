public enum VadeOranlari {

    GUN(14.50f,1),
    AY(17.0f,30),
    YIL(16.25f,365),
    SIFIR(0.0f,0);


    private Float oran;
    private Integer gunSayisi;

    VadeOranlari(Float oran, Integer gunSayisi){
        this.oran = oran;
        this.gunSayisi = gunSayisi;
    }

    public float getOran(){
        return oran;
    }

    public Integer getGunSayisi(){
        return gunSayisi;
    }
}
