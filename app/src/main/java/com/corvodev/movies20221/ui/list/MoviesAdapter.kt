package com.corvodev.movies20221.ui.list
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.corvodev.movies20221.R
import com.corvodev.movies20221.databinding.CardViewItemMovieBinding

class MoviesAdapter(
    private val moviesList: ArrayList<Movie>,
    private val onItemClicked: (Movie) -> Unit
) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapter.MovieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_view_item_movie, parent, false)
        return MovieViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MoviesAdapter.MovieViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.bindMovie(movie)
    }

    fun appendItems(newList: ArrayList<Movie>) {
        moviesList.clear()
        moviesList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = moviesList.size

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = CardViewItemMovieBinding.bind(itemView)

        fun bindMovie(movie: Movie) {

        }
    }
}