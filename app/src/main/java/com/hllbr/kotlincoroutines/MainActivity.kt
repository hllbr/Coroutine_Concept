package com.hllbr.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Light weightness
        /*
        GlobalScope.launch {
            //Bu yapı bir kapsam bunun dışında başka kapsamlar var mı bakılacak ilerleyen projelerde
            repeat(100000){
                //repeat(100_000) şeklinde de yazılabilir.
                launch {
                    //burada 100000 kez coroutines oluşturuyoruz
                    println("android")
                }
            }

        }*/

    }
}