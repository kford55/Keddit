package kennethford.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kennethford.keddit.R
import kennethford.keddit.commons.RedditNewsItem
import kennethford.keddit.commons.adapter.ViewType
import kennethford.keddit.commons.adapter.ViewTypeDelegateAdapter
import kennethford.keddit.commons.extensions.getFriendlyTime
import kennethford.keddit.commons.extensions.inflate
import kennethford.keddit.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

class NewsDelegateAdapter() : ViewTypeDelegateAdapter {


    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup):
            RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)) {
        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}