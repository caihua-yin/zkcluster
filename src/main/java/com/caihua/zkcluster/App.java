package com.caihua.zkcluster;

/**
 * ZK Cluster!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        String role = "master";
        if (args.length == 1) {
            role = args[0];
        }
        while (true) {
            try {
                System.out.println("I am " + role + "...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
