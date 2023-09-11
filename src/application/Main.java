package application;

import entities.Apartamento;
import entities.Casa;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "bem vindo a imobiliaria","imobiliaria",JOptionPane.INFORMATION_MESSAGE);
        int resp = 0;

        do {
            String valores[] = {"CASA - 1", "APARTAMENTO - 2"};
            Object escolha = JOptionPane.showInputDialog(null, "Qual tipo de imovel deseja cadastrar?", "imobiliaria" ,JOptionPane.WARNING_MESSAGE, null, valores, valores[0]);

            if (escolha.equals("CASA - 1")) {
                cadastraCasa();
            } else if (escolha.equals("APARTAMENTO - 2")) {
                cadastraApartamento();
            }
        } while (resp == 0);
    }

    private static void cadastraCasa() {
        StringBuilder casaAdicionada = new StringBuilder();
        Casa casa;

        while (true) {
            String cidade = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            int tamQuintal = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do quintal: "));
            double contaAgua = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta de Água: "));

            casa = new Casa();
            casa.setCidade(cidade);
            casa.setTamQuintal(tamQuintal);
            casa.setContaAgua(contaAgua);
            casa.imprimirDadosImovel();

            int respota = JOptionPane.showConfirmDialog(null, "Você deseja cadastrar mais casas? ", "imobiliaria", JOptionPane.YES_NO_OPTION);
            if (respota != JOptionPane.YES_OPTION) {
                break;
            }
        } if (casaAdicionada.length() == 1) {
            JOptionPane.showMessageDialog(null, "Você cadastrou as seguintes casas: " + casaAdicionada.toString(), "imobiliaria", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Você cadastrou as seguintes casas: " + casaAdicionada.toString(), "imobiliaria", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private static void cadastraApartamento() {
        StringBuilder apAdiciona = new StringBuilder();
        Apartamento apartamento;

        while (true) {
            String cidade = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            double condominio = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do condominio: "));

            apartamento = new Apartamento();
            apartamento.setCidade(cidade);
            apartamento.setCondominio(condominio);
            apartamento.imprimirDadosImovel();

            int respota = JOptionPane.showConfirmDialog(null, "Você deseja cadastrar mais apartamentos? ", "imobiliaria", JOptionPane.YES_NO_OPTION);
            if (respota != JOptionPane.YES_OPTION) {
                break;
            }
        } if (apAdiciona.length() == 1) {
            JOptionPane.showMessageDialog(null, "Você cadastrou os seguintes apartamentos: " + apAdiciona.toString(), "imobiliaria", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Você cadastrou os seguintes apartamentos: " + apAdiciona.toString(), "imobiliaria", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}