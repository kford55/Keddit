package kennethford.keddit.commons

import kennethford.keddit.commons.adapter.AdapterConstants
import kennethford.keddit.commons.adapter.ViewType

data class RedditNewsItem(
        var author: String,
        var title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}