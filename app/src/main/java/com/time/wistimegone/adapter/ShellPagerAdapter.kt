package com.time.wistimegone.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.time.wistimegone.fragment.AlarmClockFragment
import com.time.wistimegone.fragment.ChronographFragment
import com.time.wistimegone.fragment.TimerFragment
import com.time.wistimegone.fragment.WorldTimeFragment

const val ALARM_CLOCK_FRAGMENT = 0
const val WORLD_TIME_FRAGMENT = 1
const val CHRONOGRAPH_FRAGMENT = 2
const val TIMER_FRAGMENT = 3

/**
 * Created by yangping on 2020/6/19
 */
class ShellPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        ALARM_CLOCK_FRAGMENT to { AlarmClockFragment() },
        WORLD_TIME_FRAGMENT to { WorldTimeFragment() },
        CHRONOGRAPH_FRAGMENT to { ChronographFragment() },
        TIMER_FRAGMENT to { TimerFragment() }
    )

    override fun getItemCount(): Int = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}