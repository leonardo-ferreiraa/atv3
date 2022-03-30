/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ser_humano;

/**
 *
 * @author Leonardo Ferreira 11211100857@alunos.umc.br
 */
public class Ser_humano {

    public static void main(String[] args) {
        corpo_humano C1 = new corpo_humano(54, 1.50);
        System.out.println(C1.GetDensidade());
        corpo_humano IMC = new corpo_humano(70, 1.90);
        System.out.println(IMC.GetDensidade());
    }
}
//1- O comando mostra um erro por conta do acesso do valor de massa estar privado na classe corpo_humano
//2- Ao fazer a alteração na linha private float massa para public float massa a variável deixou de ser exclusiva e se tornou acessível a parte externa
//3- mostra um erro em que o método SetVolume não é possível ser utilizado o metodo na main