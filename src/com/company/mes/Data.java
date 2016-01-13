package com.company.mes;

/**
 * Created by callo on 13-01-2016.
 */
public class Data {

    //promień minimalny wsadu [m]
    public float Rmin;
    //promień maksymalny wasdu [m]
    public float Rmax;
    //współczynnik konwekcyjnej wymiany ciepła [W/m2C]
    public float AlfaAir;
    //temp początkowa C
    public float TempBegin;
    //temp otoczenia C
    public float TempAir;
    //czas procesu [s]
    public float TauMax;
    //efektywne ciepło właściwe [J/kgC]
    public float C;
    //wsp przewodzenia ciepła [W/mC]
    public float K;
    //gestosc metalu kg/m4
    public float Ro;

    public int nh;

    public int ne = nh - 1;

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "Rmin=" + Rmin +
                ", Rmax=" + Rmax +
                ", AlfaAir=" + AlfaAir +
                ", TempBegin=" + TempBegin +
                ", TempAir=" + TempAir +
                ", TauMax=" + TauMax +
                ", C=" + C +
                ", K=" + K +
                ", Ro=" + Ro +
                ", nh=" + nh +
                ", ne=" + ne +
                '}';
    }

    public int getNh() {
        return nh;
    }

    public void setNh(int nh) {
        this.nh = nh;
    }

    public int getNe() {
        return ne;
    }

    public void setNe(int ne) {
        this.ne = ne;
    }

    public float getRmin() {
        return Rmin;
    }

    public void setRmin(float rmin) {
        Rmin = rmin;
    }

    public float getRmax() {
        return Rmax;
    }

    public void setRmax(float rmax) {
        Rmax = rmax;
    }

    public float getAlfaAir() {
        return AlfaAir;
    }

    public void setAlfaAir(float alfaAir) {
        AlfaAir = alfaAir;
    }

    public float getTempBegin() {
        return TempBegin;
    }

    public void setTempBegin(float tempBegin) {
        TempBegin = tempBegin;
    }

    public float getTempAir() {
        return TempAir;
    }

    public void setTempAir(float tempAir) {
        TempAir = tempAir;
    }

    public float getTauMax() {
        return TauMax;
    }

    public void setTauMax(float tauMax) {
        TauMax = tauMax;
    }

    public float getC() {
        return C;
    }

    public void setC(float c) {
        C = c;
    }

    public float getK() {
        return K;
    }

    public void setK(float k) {
        K = k;
    }

    public float getRo() {
        return Ro;
    }

    public void setRo(float ro) {
        Ro = ro;
    }
}
