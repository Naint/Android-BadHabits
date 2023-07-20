package com.example.badhabits

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.badhabits.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = HabitAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() = with(binding){

        rcView.layoutManager = LinearLayoutManager(this@MainActivity)
        rcView.adapter = adapter

        buttonAdd.setOnClickListener{
            val habit = Habit(null, "One", "12.07", "none", "22", "1", "2", "ыхыхыхых")
            adapter.addHabit(habit)
            createAddHabitDialog()
        }

    }






    fun getCurrentDate() : String{
        var dateNow = "00.xx.00"
        dateNow = Calendar.getInstance().time.toString()
        return dateNow
    }

    private fun createAddHabitDialog(){
        val builder = AlertDialog.Builder(this);
        builder.setMessage("Hel")
        builder.show()
    }


}