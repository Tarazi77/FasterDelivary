package com.example.fasterdelivary.screens.pharmacy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fasterdelivary.R
import com.example.fasterdelivary.databinding.FragmentPharmacyBinding

class PharmacyFragment : Fragment() {

    lateinit var binding: FragmentPharmacyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pharmacy, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val phrasesDataSet: List<Pharmacy> = PhraseAndPhotoDataSourse().loadPharmacy()
        val recyclerView: RecyclerView = view.findViewById<RecyclerView>(R.id.recycler_market)
        recyclerView.adapter = PharmacyAdapter(this, phrasesDataSet)
    }

}