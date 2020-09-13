package com.businessapp.pictureidea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class SavedListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_list)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setTitle(R.string.saved_idea_name)

        var savedData = mutableListOf("Test data1", "Test data2")

        var adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            savedData)

        var savedListView: ListView = findViewById(R.id.savedListView)
        savedListView.setAdapter(adapter)

        savedListView.setOnItemClickListener(listClickAction)
    }

    var listClickAction = object:AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            var intent = Intent(application, SavedDetailActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}