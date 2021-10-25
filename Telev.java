/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telev;

/**
 *
 * @author mhmds
 */
public class Telev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV tv=new TV();
        tv.turnOn();
        tv.turnOff();
        tv.channelUp();
        tv.getChannel();
        // TODO code application logic here
    }
    
}
