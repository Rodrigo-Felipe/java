/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities2;

/**
 *
 * @author rodrigofelipe
 */
public class OutsourceEmployee extends Employee{
    
    private Double additionalCharge;
    
    public OutsourceEmployee(){
        super();
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    
    public OutsourceEmployee(String name, Integer hours, Double valuePerHour,Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
        
    }
}
