/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serlvet;

/**
 *
 * @author Sabrina
 */
public class ConverterBean
{

    private double tempResult, tempBefore;
    private String convertText, einheitBefore, einheitAfter; 

    public ConverterBean(double tempResult, String convertText, double tempBefore, String einheitBefore, String einheitAfter)
    {
        this.tempResult = tempResult;
        this.convertText = convertText;
        this.tempBefore = tempBefore;
        this.einheitBefore = einheitBefore;
        this.einheitAfter = einheitAfter;
    }

    public ConverterBean()
    {
        
    }

    public String getConvertText()
    {
        return convertText;
    }

    public void setConvertText(String convertText)
    {
        this.convertText = convertText;
    }

    public double getTempResult()
    {
        return tempResult;
    }

    public double getTempBefore()
    {
        return tempBefore;
    }

    public String getEinheitBefore()
    {
        return einheitBefore;
    }

    public String getEinheitAfter()
    {
        return einheitAfter;
    }

    public void setTempResult(double tempResult)
    {
        this.tempResult = tempResult;
    }

    public void setTempBefore(double tempBefore)
    {
        this.tempBefore = tempBefore;
    }

    public void setEinheitBefore(String einheitBefore)
    {
        this.einheitBefore = einheitBefore;
    }

    public void setEinheitAfter(String einheitAfter)
    {
        this.einheitAfter = einheitAfter;
    }
    
    
    
    
    
    

}
