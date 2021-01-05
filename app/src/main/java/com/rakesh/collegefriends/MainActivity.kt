package com.rakesh.collegefriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// If you want the login activity to enter in main activity which is ministers information page then you have to remove "//" this.
class MainActivity : AppCompatActivity() {
   // var titlename : String? = "Ministry"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)
    //if(intent!=null)
         // titlename=intent.getStringExtra("Name")
      //title=titlename
    }


}