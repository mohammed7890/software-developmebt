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
public class TV {
    private int channel;
    private int allchannels;
    private int volumelevel;
    private int allvolumelevels;
    private boolean on;
    public TV(){
       channel=0;
       allchannels=120;
       volumelevel=0;
       allvolumelevels=7;
       on=false;
               
    }
    public void turnOn()
    {
        on=true;
    }
    public void turnOff()
    {
        on=false;
    }
    public void setChannel(int newChannel)
    {
        allchannels++;
    }
    public void setVolume(int newVolumeLevel)
    {
        allvolumelevels++;
    }
    public void channelUp()
    {
        if(on==true)
            channel=(channel+1)%allchannels;
    }
    public void channelDown()
    {
        if(on==true)
            channel=(channel-1)%allchannels;
    }
    public void volumeUp()
    {
        if(on==true&&volumelevel<allvolumelevels)
            volumelevel++;
        
    }
    public void volumeDown()
    {
        if(on==true&&volumelevel>0)
            volumelevel--;
        
    }
    public void getChannel()
    {
        System.out.println("the current channel is "+channel+" volume is "+volumelevel);
    }
    
}
