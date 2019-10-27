package com.example.fragmenthw

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_lista.*
import kotlinx.android.synthetic.main.fragment_lista.view.*


class ListaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val detalleFragment = DetalleFragment()
        val view: View = inflater.inflate(R.layout.fragment_lista, container, false)
        val detalleButton = view.findViewById(R.id.detalleButton) as Button
        val fragmentTransaction = fragmentManager?.beginTransaction()

        detalleButton.setOnClickListener { view ->
            Log.i("ListaFragment", "ButtonClicked")

            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                fragmentTransaction?.replace(R.id.FrameLayoutList, detalleFragment)
                fragmentTransaction?.commit()

            }else {
                fragmentTransaction?.replace(R.id.FrameLayoutDetail, detalleFragment)
                fragmentTransaction?.commit()
            }

        }



        return view
    }

}
