package com.time.wistimegone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.time.wistimegone.R
import com.time.wistimegone.adapter.*
import com.time.wistimegone.databinding.FragmentTimeShellBinding

/**
 * @author yangping
 */

class TimeShellFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTimeShellBinding.inflate(inflater, container, false)
        val tabLayout = binding.shellTabs
        val viewpager = binding.shellViewpager
        viewpager.adapter = ShellPagerAdapter(this)

         TabLayoutMediator(tabLayout,viewpager){tab, position ->
             tab.text = getTabTitle(position)
         }.attach()

        return binding.root
    }

    private fun getTabTitle(position: Int): String? {
        return when(position){
            ALARM_CLOCK_FRAGMENT -> getString(R.string.fragment_alarm_clock_title)
            WORLD_TIME_FRAGMENT -> getString(R.string.fragment_world_time_title)
            CHRONOGRAPH_FRAGMENT -> getString(R.string.fragment_chronograph_title)
            TIMER_FRAGMENT -> getString(R.string.fragment_timer_title)
            else -> null
        }
    }

}