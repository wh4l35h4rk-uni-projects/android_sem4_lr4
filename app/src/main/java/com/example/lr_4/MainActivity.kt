package com.example.lr_4

import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this).get(MyVM::class.java)

        findViewById<Button>(R.id.button).SetOnCLickListener {
            val user = User("LOGIN", "PASSWORD")
            vm.add(user)
        }

        vm.data.observe(this){
            findViewById<TextView>(R.id.tv).text = it
        }
    }

}