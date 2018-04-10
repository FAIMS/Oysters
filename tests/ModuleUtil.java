package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  General
     */
    public static View get_General(Solo solo) {
        String ref = "General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Shellfish_Aggregation
     */
    public static View get_ShellfishAggregation(Solo solo) {
        String ref = "Shellfish_Aggregation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Trip
     */
    public static View get_Trip(Solo solo) {
        String ref = "Trip";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  General/General
     */
    public static View get_General_General(Solo solo) {
        String ref = "General/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/User_login
     */
    public static View get_Login_Userlogin(Solo solo) {
        String ref = "Login/User_login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Shellfish_Aggregation/Aggregation_Attributes
     */
    public static View get_ShellfishAggregation_AggregationAttributes(Solo solo) {
        String ref = "Shellfish_Aggregation/Aggregation_Attributes";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Shellfish_Aggregation/Shellfish_Type
     */
    public static View get_ShellfishAggregation_ShellfishType(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trip/Shellfish_Aggregation
     */
    public static View get_Trip_ShellfishAggregation(Solo solo) {
        String ref = "Trip/Shellfish_Aggregation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trip/Shoreline_attributes
     */
    public static View get_Trip_Shorelineattributes(Solo solo) {
        String ref = "Trip/Shoreline_attributes";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trip/Trip_data
     */
    public static View get_Trip_Tripdata(Solo solo) {
        String ref = "Trip/Trip_data";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  General/General/Start_Trip
     */
    public static View get_General_General_StartTrip(Solo solo) {
        String ref = "General/General/Start_Trip";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  General/Search/Search_Button
     */
    public static View get_General_Search_SearchButton(Solo solo) {
        String ref = "General/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/User_login/Log_in
     */
    public static View get_Login_Userlogin_Login(Solo solo) {
        String ref = "Login/User_login/Log_in";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/User_login/Sign_up
     */
    public static View get_Login_Userlogin_Signup(Solo solo) {
        String ref = "Login/User_login/Sign_up";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Shellfish_Aggregation/Aggregation_Attributes/Aggregation_Photos_Button_1
     */
    public static View get_ShellfishAggregation_AggregationAttributes_AggregationPhotosButton1(Solo solo) {
        String ref = "Shellfish_Aggregation/Aggregation_Attributes/Aggregation_Photos_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Shellfish_Aggregation/Shellfish_Type/Shellfish_Photo_Button_1
     */
    public static View get_ShellfishAggregation_ShellfishType_ShellfishPhotoButton1(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Shellfish_Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trip/Shellfish_Aggregation/Add_Shellfish_Aggregation
     */
    public static View get_Trip_ShellfishAggregation_AddShellfishAggregation(Solo solo) {
        String ref = "Trip/Shellfish_Aggregation/Add_Shellfish_Aggregation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trip/Shoreline_attributes/Check_for_Missing_Data
     */
    public static View get_Trip_Shorelineattributes_CheckforMissingData(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Check_for_Missing_Data";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trip/Shoreline_attributes/Habitat_photo_Button_1
     */
    public static View get_Trip_Shorelineattributes_HabitatphotoButton1(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Habitat_photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trip/Trip_data/Take_From_GPS_1
     */
    public static View get_Trip_Tripdata_TakeFromGPS1(Solo solo) {
        String ref = "Trip/Trip_data/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Shellfish_Aggregation/Aggregation_Attributes/Aggregation_Photos
     */
    public static View get_ShellfishAggregation_AggregationAttributes_AggregationPhotos(Solo solo) {
        String ref = "Shellfish_Aggregation/Aggregation_Attributes/Aggregation_Photos";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Shellfish_Aggregation/Shellfish_Type/Shellfish_Photo
     */
    public static View get_ShellfishAggregation_ShellfishType_ShellfishPhoto(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Shellfish_Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Trip/Shoreline_attributes/Habitat_photo
     */
    public static View get_Trip_Shorelineattributes_Habitatphoto(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Habitat_photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Trip/Shoreline_attributes/Adjacent_land_use
     */
    public static View get_Trip_Shorelineattributes_Adjacentlanduse(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Adjacent_land_use";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Trip/Shoreline_attributes/Animals_present
     */
    public static View get_Trip_Shorelineattributes_Animalspresent(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Animals_present";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Trip/Shoreline_attributes/Artificial_habitat_types
     */
    public static View get_Trip_Shorelineattributes_Artificialhabitattypes(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Artificial_habitat_types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Trip/Shoreline_attributes/Natural_habitat_types
     */
    public static View get_Trip_Shorelineattributes_Naturalhabitattypes(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Natural_habitat_types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  General/Search/Entity_Types
     */
    public static View get_General_Search_EntityTypes(Solo solo) {
        String ref = "General/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Login/User_login/Users
     */
    public static View get_Login_Userlogin_Users(Solo solo) {
        String ref = "Login/User_login/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Shellfish_Aggregation/Aggregation_Attributes/Density_of_aggregation
     */
    public static View get_ShellfishAggregation_AggregationAttributes_Densityofaggregation(Solo solo) {
        String ref = "Shellfish_Aggregation/Aggregation_Attributes/Density_of_aggregation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Shellfish_Aggregation/Shellfish_Type/Primary_substrate
     */
    public static View get_ShellfishAggregation_ShellfishType_Primarysubstrate(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Primary_substrate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Shellfish_Aggregation/Shellfish_Type/Shellfish_type
     */
    public static View get_ShellfishAggregation_ShellfishType_Shellfishtype(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Shellfish_type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Shellfish_Aggregation/Shellfish_Type/Surrounding_substrate
     */
    public static View get_ShellfishAggregation_ShellfishType_Surroundingsubstrate(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Surrounding_substrate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trip/Shoreline_attributes/Shoreline_slope
     */
    public static View get_Trip_Shorelineattributes_Shorelineslope(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Shoreline_slope";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trip/Trip_data/Subregion
     */
    public static View get_Trip_Tripdata_Subregion(Solo solo) {
        String ref = "Trip/Trip_data/Subregion";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  General/Search/Search_Term
     */
    public static EditText get_General_Search_SearchTerm(Solo solo) {
        String ref = "General/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shellfish_Aggregation/Shellfish_Type/Date
     */
    public static View get_ShellfishAggregation_ShellfishType_Date(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Date";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shellfish_Aggregation/Shellfish_Type/Subregion
     */
    public static View get_ShellfishAggregation_ShellfishType_Subregion(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Subregion";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shellfish_Aggregation/Shellfish_Type/Time
     */
    public static View get_ShellfishAggregation_ShellfishType_Time(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Time";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Shoreline_attributes/Dominant_habitat
     */
    public static EditText get_Trip_Shorelineattributes_Dominanthabitat(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Dominant_habitat";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Accuracy
     */
    public static View get_Trip_Tripdata_Accuracy(Solo solo) {
        String ref = "Trip/Trip_data/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Date
     */
    public static View get_Trip_Tripdata_Date(Solo solo) {
        String ref = "Trip/Trip_data/Date";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Easting
     */
    public static View get_Trip_Tripdata_Easting(Solo solo) {
        String ref = "Trip/Trip_data/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Latitude
     */
    public static View get_Trip_Tripdata_Latitude(Solo solo) {
        String ref = "Trip/Trip_data/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Longitude
     */
    public static View get_Trip_Tripdata_Longitude(Solo solo) {
        String ref = "Trip/Trip_data/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Northing
     */
    public static View get_Trip_Tripdata_Northing(Solo solo) {
        String ref = "Trip/Trip_data/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trip/Trip_data/Time
     */
    public static View get_Trip_Tripdata_Time(Solo solo) {
        String ref = "Trip/Trip_data/Time";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  General/Search/Entity_List
     */
    public static View get_General_Search_EntityList(Solo solo) {
        String ref = "General/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Trip/Shellfish_Aggregation/Existing_Aggregations
     */
    public static View get_Trip_ShellfishAggregation_ExistingAggregations(Solo solo) {
        String ref = "Trip/Shellfish_Aggregation/Existing_Aggregations";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: picture
        Ref:  Shellfish_Aggregation/Aggregation_Attributes/Size_of_aggregation
     */
    public static View get_ShellfishAggregation_AggregationAttributes_Sizeofaggregation(Solo solo) {
        String ref = "Shellfish_Aggregation/Aggregation_Attributes/Size_of_aggregation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: picture
        Ref:  Shellfish_Aggregation/Shellfish_Type/Shellfish_species
     */
    public static View get_ShellfishAggregation_ShellfishType_Shellfishspecies(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Shellfish_species";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Shellfish_Aggregation/Aggregation_Attributes/Distance_to_water_in_m
     */
    public static View get_ShellfishAggregation_AggregationAttributes_Distancetowaterinm(Solo solo) {
        String ref = "Shellfish_Aggregation/Aggregation_Attributes/Distance_to_water_in_m";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Shellfish_Aggregation/Shellfish_Type/Shellfish_status
     */
    public static View get_ShellfishAggregation_ShellfishType_Shellfishstatus(Solo solo) {
        String ref = "Shellfish_Aggregation/Shellfish_Type/Shellfish_status";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Trip/Shoreline_attributes/Wastewater_outflows
     */
    public static View get_Trip_Shorelineattributes_Wastewateroutflows(Solo solo) {
        String ref = "Trip/Shoreline_attributes/Wastewater_outflows";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Login/User_login/Signup_Guide_1
     */
    public static View get_Login_Userlogin_SignupGuide1(Solo solo) {
        String ref = "Login/User_login/Signup_Guide_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Trip/Shellfish_Aggregation/Add_Shellfish_Aggregation_Guide
     */
    public static View get_Trip_ShellfishAggregation_AddShellfishAggregationGuide(Solo solo) {
        String ref = "Trip/Shellfish_Aggregation/Add_Shellfish_Aggregation_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Trip/Shellfish_Aggregation/Existing_Aggregations_Guide
     */
    public static View get_Trip_ShellfishAggregation_ExistingAggregationsGuide(Solo solo) {
        String ref = "Trip/Shellfish_Aggregation/Existing_Aggregations_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Trip/Shellfish_Aggregation/HR_Guide
     */
    public static View get_Trip_ShellfishAggregation_HRGuide(Solo solo) {
        String ref = "Trip/Shellfish_Aggregation/HR_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Trip/Trip_data/GPS_Guide
     */
    public static View get_Trip_Tripdata_GPSGuide(Solo solo) {
        String ref = "Trip/Trip_data/GPS_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }
}
