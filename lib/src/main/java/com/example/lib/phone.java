package com.example.lib;
public class phone {
    private String Brand;
    private String Model;
    private String Makeyear;
    private String Price;
    private int Number;
    public phone(int number,String brandin,String modelin,String makeyearin,String pricein){
        Number = number;
        Brand = brandin;
        Model = modelin;
        Makeyear = makeyearin;
        Price = pricein;
    }
    public String getBrand(){
        return Brand;
    }
    public String getModel(){
        return Model;
    }
    public String getMakeyear(){
        return Makeyear;
    }
    public String getPrice(){
        return Price;
    }
    public void alldetailedprint(){
        System.out.println("���"+Number+" �~�P:"+Brand+" ����:"+Model+" �X�t�~��:"+Makeyear+" ����:"+Price);
    }
}