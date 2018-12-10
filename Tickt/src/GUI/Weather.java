/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author holo7
 */
public class Weather {
    
    ResponseBody CairoWeather;
    
    public float getResult() {
        return CairoWeather.val;
    }
    
    class ResponseBody {
        float val;
    }
    
}
