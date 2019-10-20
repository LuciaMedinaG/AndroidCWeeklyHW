package com.example.fragmenthw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_lista.*
//import sun.jvm.hotspot.utilities.IntArray



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listaFragment = ListaFragment()
        var detalleFragment = DetalleFragment()
        val fragmentManager: FragmentManager = this.getSupportFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.FrameLayoutList, listaFragment)
        fragmentTransaction.commit()

       /// listaFragment.detalleButton.setOnClickListener { view ->
            listaFragment.view.detalleButton.setOnClickListener {
                fragmentTransaction.replace(R.id.FrameLayoutList, detalleFragment)
                fragmentTransaction.commit()

            }


    }
}


