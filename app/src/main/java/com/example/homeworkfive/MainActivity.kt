package com.example.homeworkfive

import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup.setOnClickListener(){

        }
        cb1.setOnCheckedChangeListener() { buttonView,isChecked->
            if(isChecked){
                var x=buttonView.text.toString()
                Toast.makeText(this, "selected this $x",
                    Toast.LENGTH_SHORT).show()
            }
        }
        cb2.setOnCheckedChangeListener() { buttonView,isChecked->
            if(isChecked){
                var x=buttonView.text.toString()
                Toast.makeText(this, "selected this $x",
                    Toast.LENGTH_SHORT).show()
            }
        }
        cb3.setOnCheckedChangeListener() { buttonView,isChecked->
            if(isChecked){
                var x=buttonView.text.toString()
                Toast.makeText(this, "selected this $x",
                    Toast.LENGTH_SHORT).show()
            }
        }
        radioGroup.setOnCheckedChangeListener(){ group,checkedId->
            val clicked=group.findViewById(checkedId) as RadioButton
            val checked=clicked.isChecked
            if(checked){
                var x=clicked.text.toString()
                Toast.makeText(this, "selected this: $x",
                    Toast.LENGTH_SHORT).show()
            }
        }
        button1.setOnClickListener(){
             var d= LocalDate.now().toString()
             var t= LocalTime.now().toString()
            val formatter= DateTimeFormatter.ISO_LOCAL_TIME
            val time=t.format(formatter)
            var a1:Int=0
            var a2:Int=0
            var a3:Int=0
            var a4:Int=0
            if( rd2.isChecked)
               a1=40
            if(cb1.isChecked)
                a2=30
            if(cb2.isChecked)
                a3=30
            if(cb3.isChecked)
                a4=-20
            val total=a1+a2+a3+a4
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Congratulations! You submitted on current date:$d time:$time, Your achieved $total%")
                .setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, id ->

                })
            val alert = dialogBuilder.create()
            alert.setTitle("Your Score")
            alert.show()
        }
        button2.setOnClickListener(){
            cb1.isChecked = false;
            cb2.isChecked = false;
            cb3.isChecked = false;
            rd1.isChecked=false;
            rd2.isChecked=false;
            rd3.isChecked=false;
        }
        button3.setOnClickListener(){
            val x=Intent(this, MainActivity2::class.java)
            startActivity(x)
        }
    }//end fun on create
}//end of main class