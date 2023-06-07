package uz.abbosbek.iyul_06_07_2023.anadpter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.abbosbek.iyul_06_07_2023.databinding.ItemRvBinding
import uz.abbosbek.iyul_06_07_2023.models.User

class RvAdapter(private var list:ArrayList<User> = ArrayList()): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){

        fun onBind(myContact: User){
            itemRvBinding.tvName.text = myContact.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}