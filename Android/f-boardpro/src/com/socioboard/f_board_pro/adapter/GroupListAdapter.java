package com.socioboard.f_board_pro.adapter;
//adapter for setting group list

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

 





import com.socioboard.f_board_pro.R;
import com.socioboard.f_board_pro.database.util.JSONParseraa;
import com.socioboard.f_board_pro.database.util.MainSingleTon;
import com.socioboard.f_board_pro.models.GroupModel;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GroupListAdapter extends BaseAdapter 
{
	private Context context;
	private ArrayList<GroupModel> groupList;
    Handler handler = new Handler();
	
	public GroupListAdapter(Context context, ArrayList<GroupModel> groupList) 
	{
		super();
		this.context = context;
		this.groupList = groupList;
	}

	@Override
	public int getCount()
	{
		
		return groupList.size();
	}

	@Override
	public Object getItem(int position)
	{
		
		return groupList.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return groupList.indexOf(getItem(position));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		if (convertView == null)
		{
			LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = mInflater.inflate(R.layout.get_groups_item, parent, false);
		}
		TextView groupName=(TextView) convertView.findViewById(R.id.group_name);
		groupName.setText(groupList.get(position).getGroupName());
		
		TextView groupUnread=(TextView) convertView.findViewById(R.id.unread);
		groupUnread.setText(""+groupList.get(position).getGroupUnread());
		
		if(groupList.get(position).getGroupUnread()<=0)
		{
			groupUnread.setVisibility(View.INVISIBLE);
		}
		ImageView groupIcon=(ImageView) convertView.findViewById(R.id.group_icon);
//		groupIcon.setBackgroundResource(R.drawable.account_image);
		
		new GetGroupIconUrl(groupList.get(position).getGroupId(),groupIcon).execute();
		
		
		
		/*if(groupList.get(position).getGroupIcon()!=null)
			
		groupIcon.setBackgroundResource(R.drawable.account_image);*/
		System.out.println("groupList.get(position).getGroupIcon()============"+groupList.get(position).getGroupIcon());
		
		return convertView;
	}
	public void getBitmap(final ImageView profilePic,final String iconUrl)
    {
    	
    	new Thread(new Runnable() {

			@Override
			public void run() {
				
				handler.post(new Runnable()
				{
					
					Bitmap pfofile  = MainSingleTon.getBitmapFromURL(iconUrl);
					@Override
					public void run()
					{
						
						profilePic.setImageBitmap((pfofile));
					}
				});
			
			
			}
		}).start();
    }
	public class GetGroupIconUrl extends AsyncTask<Void, Void, String>
	{
		String userFBiD =null;
		String userFBaccesToken = null;
		String type = null;
		String id=null;
		ImageView icon;
		public GetGroupIconUrl(String id,ImageView icon)
		{
			super();
			this.id = id;
			this.icon=icon;
		}

		@Override
		protected String doInBackground(Void... params) 
		{

			userFBaccesToken = MainSingleTon.accesstoken;
			userFBiD = MainSingleTon.userid;

			String tokenURL = "https://graph.facebook.com/"+id+"/?access_token="+userFBaccesToken;

			JSONParseraa jsonParser = new JSONParseraa();

			JSONObject jsonObject = jsonParser.getJSONFromUrl(tokenURL);

			System.out.println("getJSONFromUrl jsonObject "+jsonObject);
			
			try 
			{
				getBitmap(icon,jsonObject.getString("icon"));
			} 
			catch (JSONException e)
			{
				System.out.println("JSONException jsonObject "+e);
			}
			
			
			

			System.out.println("----------------------------------------------");
			return null;
		}

	}
}
