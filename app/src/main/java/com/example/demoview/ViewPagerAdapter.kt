package com.example.demoview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0->return Tab1Fragment()
            1->return Tab2Fragment()
            2->return Tab3Fragment()
            else-> Tab4Fragment()
        }
        return Tab1Fragment()
    }

}