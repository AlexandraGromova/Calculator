package com.example.test1

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.core.view.get


class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var oneButton: Button
    private lateinit var twoButton: Button
    private lateinit var threeButton: Button
    private lateinit var fourButton: Button
    private lateinit var fiveButton: Button
    private lateinit var sixButton: Button
    private lateinit var sevenButton: Button
    private lateinit var eightButton: Button
    private lateinit var nineButton: Button
    private lateinit var nullButton: Button
    private lateinit var commaButton: Button
    private lateinit var equallyButton: Button
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button
    private lateinit var delButton: Button
    private lateinit var multButton: Button
    private lateinit var deleteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)

        val group = findViewById<ViewGroup>(R.id.container)
        findeAllView(group)
    }

    fun findeAllView(group: ViewGroup) {
        val count = group.childCount
        for (i in 0..count - 1) {
            val view = group[i]
            if (view is LinearLayout) {
                findeAllView(view)
            } else if (view is Button) {
                view.setOnClickListener {
                    textView.setText(textView.getText().toString() + view.text);
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
    }
}