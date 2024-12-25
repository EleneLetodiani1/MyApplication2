package com.example.mobileapplications22.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mobileapplications22.R

class PageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_page, container, false)
        val textView: TextView = view.findViewById(R.id.textView)
        textView.text = arguments?.getString(ARG_TEXT)
        return view
    }

    companion object {
        private const val ARG_TEXT = "arg_text"

        fun newInstance(text: String): PageFragment {
            val fragment = PageFragment()
            val args = Bundle()
            args.putString(ARG_TEXT, text)
            fragment.arguments = args
            return fragment
        }
    }
}
