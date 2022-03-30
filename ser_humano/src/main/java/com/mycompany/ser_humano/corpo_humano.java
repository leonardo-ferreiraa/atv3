/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ser_humano;

/**
 *
 * @author Nadai
 */
public class corpo_humano {

    private float massa;
    private double densidade;
    private double volume;

    public corpo_humano(float massa, double volume) {
        this.massa = massa;
        this.volume = volume;
        densidade = massa / (volume * volume);
    }

    public float GetMassa() {
        return massa;
    }

    public double GetVolume() {
        return volume;
    }

    public double GetDensidade() {
        return densidade;
    }

    public void SetMassa(float massa) {
        this.massa = massa;
        densidade = massa / volume * volume;
    }

    public void SetVolume(float volume) {
        this.volume = volume;
        densidade = massa / volume * volume;
    }
}
