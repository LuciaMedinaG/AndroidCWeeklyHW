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
import kotlinx.android.synthetic.main.fragment_lista.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [DetalleFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DetalleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetalleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val listaFragment = ListaFragment()
         val view: View = inflater.inflate(R.layout.fragment_detalle, container, false)
         val listaButton = view.findViewById(R.id.listabutton) as Button

 /*       listaButton.setOnClickListener { rootView ->
            Log.i("DetalleFragment", "ButtonClicked")

            val fragmentTransaction = fragmentManager?.beginTransaction()


            fragmentTransaction?.replace(R.id.FrameLayoutList, listaFragment)
            fragmentTransaction?.commit()
        }*/

        return view
    }

}
