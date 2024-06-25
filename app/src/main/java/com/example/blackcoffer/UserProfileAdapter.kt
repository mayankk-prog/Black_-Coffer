package com.example.blackcoffer
class UserProfileAdapter(private val userList: List<UserProfile>) : RecyclerView.Adapter<UserProfileAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView = itemView.findViewById(R.id.userName)
        val userLocation: TextView = itemView.findViewById(R.id.userLocation)
        val inviteButton: Button = itemView.findViewById(R.id.inviteButton)
        // Initialize other views like profileImage, distance, profileScore, etc.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_profile, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userProfile = userList[position]
        holder.userName.text = userProfile.name
        holder.userLocation.text = userProfile.location
        // Set other views with userProfile data
    }

    override fun getItemCount(): Int = userList.size
}
