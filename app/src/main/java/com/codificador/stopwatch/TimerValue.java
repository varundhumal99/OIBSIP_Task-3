package com.codificador.stopwatch;
//Importing required components
import android.databinding.BaseObservable;
import android.databinding.Bindable;
//Implementing actual logic
public class TimerValue extends BaseObservable{

    private String value;

    public TimerValue(){
        value = "00:00:00:00";
    }

    @Bindable
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyPropertyChanged(BR.value);
    }
}
