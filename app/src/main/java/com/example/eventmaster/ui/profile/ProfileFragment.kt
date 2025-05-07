package com.example.eventmaster.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.eventmaster.SignInActivity
import com.example.eventmaster.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {

  private var _binding: FragmentProfileBinding? = null
  private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
      auth = FirebaseAuth.getInstance()
      _binding = FragmentProfileBinding.inflate(inflater, container, false)
      val root: View = binding.root

      val avatarImageView: ImageView = binding.Avatar
      val nameSurnameTextView: TextView = binding.NameSurname
      val infoBoxView: View = binding.InfoBox
      val topBoardView: View = binding.TopBoard
      val logoutButton: View = binding.Logout

      nameSurnameTextView.text = "Иван Иванов Иванович"

      logoutButton.setOnClickListener {
          auth.signOut()
          val intent = Intent(activity, SignInActivity::class.java)
          intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
          startActivity(intent)
          activity?.finish()
      }

      return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}