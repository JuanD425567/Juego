package programa1;

import java.util.Scanner;

public class Batallas {

    Scanner entrada = new Scanner(System.in);
    Guerrero g = new Guerrero("Guerrero", 10, 0.5, 1.5, 1.5, 2);
    Mago m = new Mago("Mago", 10, 0.5, 3, 4, 1.5);
    Arquero a = new Arquero("Arquero", 10, 0.5, 1, 5, 2);
    boolean bandera = true;

    public void Guerrero_VS_Mago() {
        while (m.getSalud() > 0 && g.getSalud() > 0) {
            System.out.println("Personaje 1: Quieres atacar[1] o defender[2]");
            int opcion = entrada.nextInt();

            System.out.println("Personaje 2 : Quieres atacar[1] o defender[2]");
            int opcion2 = entrada.nextInt();

            if (opcion == 1 && opcion2 == 1) {
                if (g.getDanio() > m.getDanio()) {
                    g.Atacar();
                    m.Atacar();
                    m.setSalud(m.getSalud() - g.getDanio());
                } else {
                    g.Atacar();
                    m.Atacar();
                    g.setSalud(g.getSalud() - m.getDanio());
                }
            } else if (opcion == 1 && opcion2 == 2) {
                if (g.getDanio() > m.getDefensa()) {
                    g.Atacar();
                    m.Defender();
                    m.setSalud(m.getSalud() - 0.5);
                } else {
                    g.Atacar();
                    m.Defender();
                }
            } else if (opcion == 2 && opcion2 == 1) {
                if (g.getDefensa() > m.getDanio()) {
                    g.Defender();
                    m.Atacar();
                } else {
                    g.Defender();
                    m.Atacar();
                    g.setSalud(g.getSalud() - 0.5);
                }
            } else if (opcion == 2 && opcion2 == 2) {
                if (g.getDefensa() > m.getDefensa()) {
                    g.Defender();
                    m.Defender();
                } else {
                    g.Atacar();
                    m.Defender();
                }
            }
            System.out.println("----------------[RESUMEN DE RONDA]---------------------");
            System.out.println("[VIDA ACTUAL DE MAGO]: " + m.getSalud());
            System.out.println("[VIDA ACTUAL DE GUERRERO]: " + g.getSalud());
            System.out.println("--------------------------------------------------------------------");
        }
        System.out.println("Quires seguir con este combate SI [1], No[2] ");
        int secuencia = entrada.nextInt();
        if (secuencia == 1) {
            if (g.getSalud() > m.getSalud()) {
                g.setDanio(g.getDanio() + 1);
                g.setDefensa(g.getDefensa() + 1);
                System.out.println("EL GUERRERO SUBE DE NIVEL");
            } else {
                m.setDefensa(m.getDefensa() + 1);
                m.setDanio(m.getDanio() + 1);
                System.out.println("EL MAGO SUBE DE NIVEL");
            }
            m.setSalud(10);
            g.setSalud(10);
            Guerrero_VS_Mago();
        }
    }

    public void Guerrero_VS_Arquero() {
        while (a.getSalud() > 0 && g.getSalud() > 0) {
            System.out.println("Personaje 1: Quieres atacar[1] o defender[2]");
            int opcion = entrada.nextInt();

            System.out.println("Personaje 2 : Quieres atacar[1] o defender[2]");
            int opcion2 = entrada.nextInt();

            if (opcion == 1 && opcion2 == 1) {
                if (g.getDanio() > a.getDanio()) {
                    g.Atacar();
                    a.Atacar();
                    a.setSalud(a.getSalud() - g.getDanio());
                } else {
                    g.Atacar();
                    a.Atacar();
                    g.setSalud(g.getSalud() - a.getDanio());
                }
            } else if (opcion == 1 && opcion2 == 2) {
                if (g.getDanio() > a.getDefensa()) {
                    g.Atacar();
                    a.Defender();
                    a.setSalud(a.getSalud() - 0.5);
                } else {
                    g.Atacar();
                    a.Defender();
                }
            } else if (opcion == 2 && opcion2 == 1) {
                if (g.getDefensa() > a.getDanio()) {
                    g.Defender();
                    a.Atacar();
                } else {
                    g.Defender();
                    a.Atacar();
                    g.setSalud(g.getSalud() - 0.5);
                }
            } else if (opcion == 2 && opcion2 == 2) {
                if (g.getDefensa() > a.getDefensa()) {
                    g.Defender();
                    a.Defender();
                } else {
                    g.Atacar();
                    a.Defender();
                }
            }
            System.out.println("----------------[RESUMEN DE RONDA]---------------------");
            System.out.println("[VIDA ACTUAL DE ARQUERO]: " + a.getSalud());
            System.out.println("[VIDA ACTUAL DE GUERRERO]: " + g.getSalud());
            System.out.println("--------------------------------------------------------------------");
        }
        System.out.println("Quires seguir con este combate SI [1], No[2] ");
        int secuencia = entrada.nextInt();
        if (secuencia == 1) {
            if (g.getSalud() > a.getSalud()) {
                g.setDanio(g.getDanio() + 1);
                g.setDefensa(g.getDefensa() + 1);
                System.out.println("EL GUERRERO SUBE DE NIVEL");
            } else {
                a.setDefensa(a.getDefensa() + 1);
                a.setDanio(a.getDanio() + 1);
                System.out.println("EL ARQUERO SUBE DE NIVEL");
            }
            a.setSalud(10);
            g.setSalud(10);
            Guerrero_VS_Arquero();
        }
    }

    public void Mago_VS_Arquero() {
        while (a.getSalud() > 0 && m.getSalud() > 0) {
            System.out.println("Personaje 1: Quieres atacar[1] o defender[2]");
            int opcion = entrada.nextInt();

            System.out.println("Personaje 2 : Quieres atacar[1] o defender[2]");
            int opcion2 = entrada.nextInt();

            if (opcion == 1 && opcion2 == 1) {
                if (m.getDanio() > a.getDanio()) {
                    m.Atacar();
                    a.Atacar();
                    a.setSalud(a.getSalud() - m.getDanio());
                } else {
                    m.Atacar();
                    a.Atacar();
                    m.setSalud(m.getSalud() - a.getDanio());
                }
            } else if (opcion == 1 && opcion2 == 2) {
                if (m.getDanio() > a.getDefensa()) {
                    m.Atacar();
                    a.Defender();
                    a.setSalud(a.getSalud() - 0.5);
                } else {
                    m.Atacar();
                    a.Defender();
                }
            } else if (opcion == 2 && opcion2 == 1) {
                if (m.getDefensa() > a.getDanio()) {
                    m.Defender();
                    a.Atacar();
                } else {
                    m.Defender();
                    a.Atacar();
                    m.setSalud(m.getSalud() - 0.5);
                }
            } else if (opcion == 2 && opcion2 == 2) {
                if (m.getDefensa() > a.getDefensa()) {
                    m.Defender();
                    a.Defender();
                } else {
                    m.Atacar();
                    a.Defender();
                }
            }
            System.out.println("----------------[RESUMEN DE RONDA]---------------------");
            System.out.println("[VIDA ACTUAL DE ARQUERO]: " + a.getSalud());
            System.out.println("[VIDA ACTUAL DE MAGO]: " + m.getSalud());
            System.out.println("--------------------------------------------------------------------");

        }
        System.out.println("");
        System.out.println("Quires seguir con este combate SI [1], No[2] ");
        int secuencia = entrada.nextInt();
        if (secuencia == 1) {
            if (m.getSalud() > a.getSalud()) {
                m.setDanio(m.getDanio() + 1);
                m.setDefensa(m.getDefensa() + 1);
                System.out.println("[EL MAGO SUBE DE NIVEL]");
            } else {
                a.setDefensa(a.getDefensa() + 1);
                a.setDanio(a.getDanio() + 1);
                System.out.println("[EL ARQUERO SUBE DE NIVEL]");
            }
            a.setSalud(10);
            m.setSalud(10);
            Mago_VS_Arquero();
        }
    }
}
