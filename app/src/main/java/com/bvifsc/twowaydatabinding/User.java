package com.bvifsc.twowaydatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import java.time.LocalDate;

/**
 * Created by Ramesh on 01-03-2019.
 */
public class User extends BaseObservable {

    String firstName="Ramesh";
    String lastName="Penta";
    @Bindable
    public String getFirstName() {
        Log.d("@Rmaesh", "FirstName" +firstName );

        return firstName;
    }

    public void setFirstName(String firstName) {
        Log.d("@Rmaesh", firstName );
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
