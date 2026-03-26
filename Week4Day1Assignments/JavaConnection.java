package org.amazon.week4Assignmesnts;

public class JavaConnection implements DatabaseConnection {

    public void connect() {
        System.out.println("connect to the server");
        
    }

    public void disconnect() {
        System.out.println("Disconnect to the server");
        
    }

    
    public void executeUpdate() {
        System.out.println("update the server now");
        
    }

    public static void main(String[] args) {
        
        JavaConnection obj=new JavaConnection();
        obj.connect();
        obj.disconnect();
        obj.executeUpdate();
       
        }
    }






