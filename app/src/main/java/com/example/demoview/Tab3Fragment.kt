package com.example.demoview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class Tab3Fragment : Fragment() {
    private lateinit var listView: ListView
    private lateinit var customAdapter: CustomAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout cho fragment
        val view = inflater.inflate(R.layout.fragment_tab3, container, false)

        listView = view.findViewById(R.id.listView)

        // Danh sách 10 phần tử
        val items = listOf(
            "Item 1",
            "Item 2",
            "Item 3",
        )

        customAdapter = CustomAdapter(requireContext(), items)
        listView.adapter = customAdapter

        return view
    }
}