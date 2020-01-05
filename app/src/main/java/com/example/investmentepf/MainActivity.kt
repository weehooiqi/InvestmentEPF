package com.example.investmentepf

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalendar.setOnClickListener(){
            val c:Calendar = Calendar.getInstance();
            val currentDay = c.get(Calendar.DAY_OF_MONTH);
            val currentMonth = c.get(Calendar.MONTH);
            val currentYear = c.get(Calendar.YEAR);

            val dpd = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener {
                    view, year, month, day ->
                     txtDOB.setText(day.toString() + "/" +
                             (month + 1).toString() + "/" +
                     year.toString())
                    val age = currentYear - year;
                    //todo age and investment installment
                    editAge.setText(age.toString())

                    if(age >= 16 && age <= 20) {
                        editSave.setText("5000")
                        val investment1 = 5000*0.3
                        editInvestment.setText(investment1.toString())
                    }
                    else if (age >= 21 && age <= 25){
                        editSave.setText("14000")
                        val investment2 = 14000*0.3
                        editInvestment.setText(investment2.toString())
                        }
                    else if (age >= 26 && age <= 30) {
                        editSave.setText("29000")
                        val investment3 = 29000*0.3
                        editInvestment.setText(investment3.toString())
                    }
                    else if (age >= 31 && age <= 35) {
                        editSave.setText("50000")
                        val investment4 = 50000*0.3
                        editInvestment.setText(investment4.toString())
                    }
                    else if (age >= 36 && age <= 40) {
                        editSave.setText("78000")
                        val investment5 = 78000*0.3
                        editInvestment.setText(investment5.toString())
                    }
                    else if (age >= 41 && age <= 45) {
                        editSave.setText("116000")
                        val investment6 = 116000*0.3
                        editInvestment.setText(investment6.toString())
                    }
                    else if (age >= 46 && age <= 50) {
                        editSave.setText("165000")
                        val investment7 = 165000*0.3
                        editInvestment.setText(investment7.toString())
                    }
                    else if (age >= 51 && age <= 55) {
                        editSave.setText("228000")
                        val investment8 = 228000*0.3
                        editInvestment.setText(investment8.toString())
                    }
                    else{
                        editSave.setText("Invalid Age")
                        editInvestment.setText("Invalid Age and Saving");
                    }
                    //val basicSaving = getSaving(age)
                    //txtAge.text = age.toString()
                    //txtBasicSaving.text = "Rm" + basicSaving.toString()
                    //txtAllowableINvextment.text = "RM" + (basicSAving * 0.3).toString()


                },currentYear, currentMonth , currentDay)
                dpd.show()

        }
    }
}
