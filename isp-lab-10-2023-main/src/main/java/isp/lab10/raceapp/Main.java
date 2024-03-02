package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500, 300);
        frame.setVisible(true);
        Car car1 = new Car("Red car", carPanel);

        Car   car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);

        Car car4 = new Car("Yellow car", carPanel);

        JFrame framee = new JFrame("Semaphore");
        framee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SemaphorePanel semaphorePanel = new SemaphorePanel();
        framee.getContentPane().add(semaphorePanel);
        framee.pack();
        framee.setVisible(true);
        PlaySound p=new PlaySound();
        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();
        try {
            semaphoreThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }p.playSound();
        car1.start(); car2.start(); car3.start(); car4.start();

        try {car1.join();
            car2.join();
            car3.join();
            car4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        p.stopSound();
    }

}
