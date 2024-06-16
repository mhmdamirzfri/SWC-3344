import java.util.*;
import java.io.*;
import javax.swing.*;

public class ArrayListOrderManager
{
    public static void main (String [] args)
    {
        try
        {
            //create a file reader to read input file
            BufferedReader in = new BufferedReader(new FileReader("Orders.txt"));
            
            //create an arraylist
            ArrayList <order> orderList = new ArrayList();
            
            //declare and create obect
            order order;
            
            //declare a line in input file
            String inData = null;
            
            while((inData = in.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(inData, ";");
                
                String orderID = st.nextToken();
                String customerName = st.nextToken();
                String customerAddress = st.nextToken();
                String productName = st.nextToken();
                int quantityOrdered = Integer.parseInt(st.nextToken());
                double pricePerUnit = Double.parseDouble(st.nextToken());
                String orderStatus = st.nextToken();
                
                //assign token to object
                order = new order(orderID, customerName, customerAddress, productName,orderStatus, quantityOrdered, pricePerUnit);
                
                //add object into arraylist
                orderList.add(order);
            }
            in.close();
            
            int menu =0;
            String input;
            
            do
            {
                System.out.println("Menu 1 - Add new order");
                System.out.println("Menu 2 - Modify order details");
                System.out.println("Menu 3 - Remove order details");
                System.out.println("Menu 4 - Display order details");
                System.out.println("Menu 5 - Exit Application");
                
                //ask user to enter the menu that they want
                input = JOptionPane.showInputDialog("Enter Menu");
                menu = Integer.parseInt(input);
                
                if(menu == 1)
                {
                    //ask user to enter new details
                    input = JOptionPane.showInputDialog("Enter order ID");
                    String orderID = input;
                        
                    input = JOptionPane.showInputDialog("Enter customer name");
                    String customerName = input;
                    
                    input = JOptionPane.showInputDialog("Enter new customer address");
                    String customerAddress = input;

                    
                    input = JOptionPane.showInputDialog("Enter product name");
                    String productName = input;
                    
                    input = JOptionPane.showInputDialog("Enter order status");
                    String orderStatus = input;
                    
                    input = JOptionPane.showInputDialog("Enter Quantity ordered");
                    int quantityOrdered = Integer.parseInt(input);
                    
                    input = JOptionPane.showInputDialog("Enter price per unit");
                    double pricePerUnit = Double.parseDouble(input);
                    
                    //assign token to object
                    order = new order(orderID, customerName, customerAddress, productName,orderStatus, quantityOrdered, pricePerUnit);
                
                    //add object into arraylist
                    orderList.add(order);
                }  
                else if (menu ==2)
                {
                    //ask user to enter the serial number 
                    input = JOptionPane.showInputDialog("Enter order ID to modify");
                    String orderID = input;
                
                    for(int i =0; i<orderList.size();i++)
                    {
                        order = orderList.get(i);
                        
                        if(order.getOrderID().equalsIgnoreCase(orderID))
                        {
                            //ask user to edit the price
                            double newprice;
                        
                            input = JOptionPane.showInputDialog("Enter new customer name");
                            String customerName = input;
                        
                            input = JOptionPane.showInputDialog("Enter new customer address");
                            String customerAddress = input;
                        
                            input = JOptionPane.showInputDialog("Enter new product name");
                            String productName = input;
                        
                            input = JOptionPane.showInputDialog("Enter new order status");
                            String orderStatus = input;
                        
                            input = JOptionPane.showInputDialog("Enter new quantity ordered");
                            int quantityOrdered = Integer.parseInt(input);
                        
                            input = JOptionPane.showInputDialog("Enter new price per unit");
                            double pricePerUnit = Double.parseDouble(input);
                        
                            //set new values to the order
                            order.setAll(orderID, customerName, customerAddress, productName,orderStatus, quantityOrdered, pricePerUnit);
                        
                            //update into arraylist
                            orderList.set(i, order);
                        }
                    }
                }
                else if (menu == 3)
                {
                    // Remove order details
                    input = JOptionPane.showInputDialog("Enter order ID to remove");
                    String orderID = input;

                    for (int i = 0; i < orderList.size(); i++) 
                    {
                        order = orderList.get(i);
                        
                        if(order.getOrderID().equalsIgnoreCase(orderID))
                        {
                            orderList.remove(i);
                        }
                    }
                }
                else if (menu == 4)
                {
                    System.out.println("Details of hardware");
                    for(int i =0; i<orderList.size();i++)
                    {   
                    order = orderList.get(i);
                    System.out.println(order);
                    }
                    
                }
            }while (menu != 5);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found:");
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        
    }
}
