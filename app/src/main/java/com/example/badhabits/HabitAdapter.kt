package com.example.badhabits

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.badhabits.databinding.HabitItemBinding
import com.example.badhabits.MainDB

class HabitAdapter : RecyclerView.Adapter<HabitAdapter.HabitHolder>() {

    val habitList = ArrayList<Habit>()

    class HabitHolder(item : View) : RecyclerView.ViewHolder(item){

        val binding = HabitItemBinding.bind(item)

        fun bind(habit: Habit) = with(binding){

            tvName.text = habit.name
            tvGoal.text = "Текущая цель: ${habit.goal}"
            tvTry.text = "Попытка: ${habit.numberAttemps}"
            tvRecord.text = "Рекорд: ${habit.record}"

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.habit_item, parent, false)
        return HabitHolder(view)
    }

    override fun onBindViewHolder(holder: HabitHolder, position: Int) {
        holder.bind(habitList[position])
    }

    override fun getItemCount(): Int {
        return habitList.size
    }

    fun addHabit(habit: Habit){
        val db = MainDB.getDb(this)

        habitList.add(habit)

        notifyDataSetChanged()
    }


}