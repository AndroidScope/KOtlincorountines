package com.example.kotlincorountines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.kotlincorountines.R.*
import kotlinx.coroutines.*
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    private var job3: Deferred<String>? = null
    private var job4: Deferred<String>?=null
    private var job: Job?=null
    private var job1: Job?=null
    lateinit  var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        text=findViewById(R.id.text)
runBlocking {
    var job1:String?=null
    var job2:String?=null
var b1= async(Dispatchers.IO) {
     netcall1()
 }
  var b2=  async(Dispatchers.IO) {
      netcall2()
  }
    Log.d("ccc", b1.toString())
    Log.d("ccc", b2.toString())
}


    }

  private suspend fun netcall1():String{
      delay(1000)
      Log.d("ccc","job1.toString()")

      return "dddd"
  }
    private suspend fun netcall2():String{
        delay(1000)
        Log.d("ccc","job2.toString()")
        return "dddsd"
    }
}