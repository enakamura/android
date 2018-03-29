package com.example.nakamura.helloworldfirebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by nakamura on 12/13/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String REG_TOKEN = "REG_TOKEN";
    private static final String RAW_URL = "RAW_URL";
    private static final String NEW_URL = "NEW_URL";
    private static final String RESPONSE_CODE = "RESPONSE_CODE";

    @Override
    public void onTokenRefresh() {
        String recent_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recent_token);

        try{
            sendToken(recent_token);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
	
	private void sendToken(String token) throws IOException {
        String rawUrl = "http://192.168.50.98:5050/test?token=%s";
        String newUrl = new String().format(rawUrl, token);

        Log.d(RAW_URL,rawUrl);
        Log.d(NEW_URL,newUrl);

        URL url = new URL(newUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("GET");

        int responseCode = httpURLConnection.getResponseCode();
        Log.d(RESPONSE_CODE,String.valueOf(responseCode));
    }
}
