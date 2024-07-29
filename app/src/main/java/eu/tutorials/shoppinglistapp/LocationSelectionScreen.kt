//package eu.tutorials.shoppinglistapp
//
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.*
//import com.google.android.gms.maps.model.CameraPosition
//import com.google.android.gms.maps.model.LatLng
//import com.google.maps.android.compose.rememberCameraPositionState
//
//@Composable
//fun LocationSelectionScreen(
//    location: LocationData,
//    onlocationSelected:(LocationData)->Unit
//){
//        val userLocation = remember{
//            mutableStateOf(LatLng(location.latitude,location.longitude))
//        }
//    val cameraPositionState = rememberCameraPositionState(
//        position = CameraPosition.fromLatLngZoom(userLocation.value,10f)
//    )
//
//
//    }
