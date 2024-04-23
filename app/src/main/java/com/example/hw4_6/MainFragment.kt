package com.example.hw4_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw4_6.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvItem.layoutManager = LinearLayoutManager(requireContext())

        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel("https://www.autostat.ru/application/includes/blocks/big_photo/images/cache/000/116/597/494654e1-670-0.jpg", "AUDI", "Audi AG — немецкая автомобилестроительная компания в составе концерна Volkswagen Group, специализирующаяся на выпуске автомобилей под маркой Audi."))
        data.add(ItemsViewModel("https://www.bmw.kg/content/dam/bmw/common/all-models/m-series/series-overview/bmw-m-series-seo-overview-ms-04.jpg", "BMW", "BMW AG — немецкий производитель автомобилей, мотоциклов, двигателей, а также велосипедов."))
        data.add(ItemsViewModel("https://s3-prod.autonews.com/s3fs-public/MERCEDES_BENZ_CLE-MAIN_i.jpg", "Mercedes", "Mercedes-Benz — торговая марка и одноимённая компания — производитель легковых автомобилей премиального класса, грузовых автомобилей, автобусов и других транспортных средств."))
        data.add(ItemsViewModel("https://motor.ru/thumb/1500x0/filters:quality(75):no_upscale()/imgs/2023/03/27/07/5850601/b7834cb797d709635d14892ca09f97f395ea4137.jpg", "Toyota", "Toyota – самая крупная автомобилестроительная корпорация Японии. Компания производит легковые и грузовые автомобили, а также автобусы."))

        val adapter = Adapter(data)

        binding.rvItem.adapter = adapter
    }
}