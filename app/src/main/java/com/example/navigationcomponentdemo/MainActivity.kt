package com.example.navigationcomponentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Communicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentFirst = FirstFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,fragmentFirst).commit()
    }

    override fun passData(editTextInput: String) {

        /** Create bundle instance and pass value by key value pair */
        val bundle = Bundle()
        bundle.putString("message",editTextInput)

        val fragmentSecond = SecondFragment()

        /** pass bundle value to fragment Second */
        fragmentSecond.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,fragmentSecond).commit()

    }
}