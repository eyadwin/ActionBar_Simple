package com.example.actionbar_simple

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        var count =tv_result
        when (item!!.itemId) {
            R.id.add -> {
                count.text="Add is clicked"
                return true
            }
            R.id.reset -> {
                count.text="Nothing is selected"
                return true
            }
            R.id.about -> {
                Toast.makeText(this, "About app", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.exit -> {
                finish()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
