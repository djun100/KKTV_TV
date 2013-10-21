package com.kklive.tv.type;

import android.os.Parcel;
import android.os.Parcelable;

public class KKTVInfo implements Parcelable{

	private String channelid;	//频道名字缩写，拼音
	private String channelname;	//频道名字
	private String channellogo;	//图标
	private String channelurl;//播放链接
	private String viewback;	//是否支持回看
	private int mediatype;	//媒体类型
	
	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(channelid);
		dest.writeString(channelname);
		dest.writeString(channellogo);
		dest.writeString(channelurl);
		dest.writeString(viewback);
		dest.writeInt(mediatype);
	}
	
	public void readFromParcel(Parcel in){
		channelid = in.readString();
		channelname = in.readString();
		channellogo = in.readString();
		channelurl = in.readString();
		viewback = in.readString();
		mediatype = in.readInt();
	}
	
	public static final Creator<KKTVInfo> CREATOR = new Creator<KKTVInfo>() {

		@Override
		public KKTVInfo createFromParcel(Parcel source) {
			return null;
		}

		@Override
		public KKTVInfo[] newArray(int size) {
			return null;
		}
		
	};

}
