package com.example.eventmaster.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.eventmaster.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

  private var _binding: FragmentProfileBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
      _binding = FragmentProfileBinding.inflate(inflater, container, false)
      val root: View = binding.root

      val avatarImageView: ImageView = binding.Avatar
      val nameSurnameTextView: TextView = binding.NameSurname
      val infoBoxView: View = binding.InfoBox
      val topBoardView: View = binding.TopBoard

      nameSurnameTextView.text = "Иван Иванов Иванович"

      infoBoxView.setBackgroundColor(resources.getColor(android.R.color.holo_blue_light, null))
      topBoardView.setBackgroundColor(resources.getColor(android.R.color.holo_blue_light, null))

      return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}