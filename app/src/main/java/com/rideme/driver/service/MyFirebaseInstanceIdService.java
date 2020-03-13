package com.rideme.driver.service;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.rideme.driver.network.Log;
import com.rideme.driver.preference.UserPreference;

//import com.google.firebase.iid.FirebaseInstanceIdService;

import static com.google.firebase.iid.FirebaseInstanceId.*;

public class MyFirebaseInstanceIdService extends FirebaseMessagingService {

   private static final String TAG = "MyFirebaseIIDService";
   private static final String FRIENDLY_ENGAGE_TOPIC = "friendly_engage";
  
   /**
    * The Application's current Instance ID token is no longer valid 
    * and thus a new one must be requested.
    */
//   @Override
//   public void onTokenRefresh() {
//       // If you need to handle the generation of a token, initially or
//       // after a refresh this is where you should do that.
//       String token = getInstance().getToken();
//       Log.d(TAG, "FCM Token: " + token);
//
//
////       sendRegistrationToServer(refreshedToken);
//   }
    @Override
    public void onNewToken(String s) {

        new UserPreference(this).updateGCMID(s);
//        saveToken(s);
    }
}