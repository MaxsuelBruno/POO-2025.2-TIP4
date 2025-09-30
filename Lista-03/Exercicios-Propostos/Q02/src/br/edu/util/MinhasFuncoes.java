package br.edu.util;
public class MinhasFuncoes {
    	    public static int converterParaSegundos(int horas, int minutos, int segundos) {
    	        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
    	        return totalSegundos;
    	 }
    }