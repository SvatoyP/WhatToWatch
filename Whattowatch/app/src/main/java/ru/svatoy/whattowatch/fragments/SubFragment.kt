package ru.svatoy.whattowatch.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.svatoy.whattowatch.R

class SubFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sub, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = SubFragment()
    }
}