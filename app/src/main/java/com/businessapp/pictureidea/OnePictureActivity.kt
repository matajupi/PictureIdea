package com.businessapp.pictureidea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class OnePictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_picture)

        setTitle(R.string.app_main_name)

        var addButton: Button = findViewById(R.id.button)
        addButton.setOnClickListener(addAction)
    }

    val addAction = object:View.OnClickListener {
        override fun onClick(v: View?) {
            var intent: Intent = Intent(application, TwoPictureActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.savedItemButton -> {
                var intent: Intent = Intent(application, SavedListActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}