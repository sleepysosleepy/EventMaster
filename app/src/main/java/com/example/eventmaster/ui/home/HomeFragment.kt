package com.example.eventmaster.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.eventmaster.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
      _binding = FragmentHomeBinding.inflate(inflater, container, false)
      val root: View = binding.root

      val TodayDateTextView: TextView = binding.TodayDate
      val CalendarHorizontalScrollView: HorizontalScrollView = binding.Calendar
      val EventTitleTextView: TextView = binding.EventTitle
      val EventTimeTextView: TextView = binding.EventTime
      val EventUnfoTextView: TextView = binding.EventInfo

    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}