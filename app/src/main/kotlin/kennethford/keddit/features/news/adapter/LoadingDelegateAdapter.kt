package kennethford.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kennethford.keddit.R
import kennethford.keddit.commons.adapter.ViewType
import kennethford.keddit.commons.adapter.ViewTypeDelegateAdapter
import kennethford.keddit.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}