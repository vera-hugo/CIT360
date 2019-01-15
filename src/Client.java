/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
public class Client {
    
    public Client( String name, String numberaccount, double balance) {
    
        this.name=name;
        this.numberaccount=numberaccount;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberaccount() {
        return numberaccount;
    }

    public void setNumberaccount(String numberaccount) {
        this.numberaccount = numberaccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    private String name;
    
    private String numberaccount;
    
    private Double balance;
    
    
}
